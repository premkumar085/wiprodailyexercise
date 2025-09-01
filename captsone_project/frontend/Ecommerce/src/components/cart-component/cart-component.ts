import { Component, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { Cart } from '../../interfaces/cart';
import { CartService } from '../../services/cart-service';
import { AuthService } from '../../services/auth-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CartItem } from '../../interfaces/cart-item';

@Component({
  selector: 'app-cart-component',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './cart-component.html',
  styleUrls: ['./cart-component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CartComponent {
  cart: Cart | null = null;
  userId: number = 0;

  constructor(
    private cartService: CartService,
    private authService: AuthService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit() {
    this.userId = this.authService.getUserId();
    this.loadCart();
  }

  loadCart() {
    if (!this.userId) return;

    this.cartService.getCartByUser(this.userId).subscribe({
      next: (res: Cart) => {
        this.cart = res;
        this.cdr.markForCheck();
      },
      error: (err: any) => console.error(err)
    });
  }

  changeQuantity(item: CartItem, qty: number) {
    if (!this.cart) return;

    item.quantity = qty;

    this.cart.totalQty = this.cart.items.reduce((sum, i) => sum + i.quantity, 0);
    this.cart.totalPrice = this.cart.items.reduce((sum, i) => sum + i.quantity * i.price, 0);

    this.cartService.addOrUpdateCart(this.cart).subscribe({
      next: (res: Cart) => {
        this.cart = res;
        this.cdr.markForCheck();
      },
      error: (err: any) => console.error(err)
    });
  }

  removeItem(item: CartItem) {
    if (!this.cart) return;

    this.cart.items = this.cart.items.filter(i => i.productId !== item.productId);
    this.cart.totalQty = this.cart.items.reduce((sum, i) => sum + i.quantity, 0);
    this.cart.totalPrice = this.cart.items.reduce((sum, i) => sum + i.quantity * i.price, 0);

    this.cartService.addOrUpdateCart(this.cart).subscribe({
      next: (res: Cart) => {
        this.cart = res;
        this.cdr.markForCheck();
      },
      error: (err: any) => console.error(err)
    });
  }
}
