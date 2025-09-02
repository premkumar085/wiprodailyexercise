import { Component, OnInit, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductService } from '../../services/product-service';
import { AuthService } from '../../services/auth-service';
import { Product } from '../../interfaces/product';
import { CartService } from '../../services/cart-service';
import { Cart } from '../../interfaces/cart';
import { CartItem } from '../../interfaces/cart-item';
import { OrderService } from '../../services/order-service';
import { Order } from '../../interfaces/order';

@Component({
  selector: 'app-product-list-component',
  templateUrl: './product-list-component.html',
  styleUrls: ['./product-list-component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush,
  standalone: true,
  imports: [CommonModule, FormsModule]
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  errorMessage = '';

  constructor(
    private productService: ProductService,
    public authService: AuthService,
    private cartService: CartService,  
    private orderService: OrderService,
    private router: Router,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    console.log("Role from localStorage:", this.authService.getRole());
    this.loadProducts();
  }

  loadProducts(): void {
    this.productService.getProducts().subscribe({
      next: (res) => {
        this.products = res;
        this.cdr.markForCheck(); 
      },
      error: (err) => {
        this.errorMessage = 'Failed to load products';
        console.error(err);
        this.cdr.markForCheck();
      }
    });
  }

  addProduct() {
    this.router.navigate(['/admin-dashboard/product/add']);

  }

  editProduct(id?: number) {
  if (id) {
    this.router.navigate(['/admin-dashboard/product/edit', id]);
  }
}


  deleteProduct(id?: number) {
    if (id && confirm('Are you sure?')) {
      this.productService.deleteProduct(id).subscribe({
        next: () => this.loadProducts(),
        error: (err) => {
          this.errorMessage = 'Failed to delete product';
          console.error(err);
          this.cdr.markForCheck();
        }
      });
    }
  }

  addToCart(prod: Product) {
  const cart: Cart = {
    id: 0,
    userId: this.authService.getUserId(),
    items: [
      { productId: prod.id!, quantity: 1, price: prod.price } as CartItem
    ],
    totalQty: 1,
    totalPrice: prod.price
  };

  this.cartService.addToCart(cart).subscribe({
    next: (res) => {
      console.log('Cart updated', res);
      alert(`${prod.prodName} added to cart!`);
    },
    error: (err: any) => {
      console.error(err);
      alert('Failed to add to cart');
    }
  });
}


  placeOrder(prod: Product) {
    const order: Order = {
      userId: this.authService.getUserId(),
      productQuantityList: [
        { productId: prod.id!, quantity: 1 } as CartItem
      ],
      totalAmount: prod.price,
      orderStatus: 'PLACED',
      orderDate: new Date().toISOString()
    };

    this.orderService.placeOrder(order).subscribe({
      next: () => alert(`Order placed for ${prod.prodName}`),
      error: (err) => {
        console.error(err);
        alert('Failed to place order');
      }
    });
  }
}
