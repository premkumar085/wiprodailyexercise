import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { ProductService } from '../product-service';
import { Router } from '@angular/router';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-purchase',
  imports: [FormsModule],
  templateUrl: './purchase.html',
  styleUrl: './purchase.css'
})
export class Purchase implements OnInit {

  products: Product[] = [];
  selectedProductId: number | null = null;
  purchaseQty: number | null = null;
  message: string = '';

  constructor(private productService: ProductService, private router: Router, private cdr: ChangeDetectorRef) {}

  ngOnInit() {
    this.productService.getProducts().subscribe((data: Product[]) => {
      this.products = data;
      this.cdr.detectChanges();
    }, error => {
      console.error('Error loading products for purchase:', error);
    });
  }

  placeOrder() {
    if (this.selectedProductId == null) {
      this.message = 'Please select a product';
      return;
    }
    const selected = this.products.find(p => p.id === this.selectedProductId);
    if (!selected) {
      this.message = 'Selected product not found';
      return;
    }
    if (!this.purchaseQty || this.purchaseQty <= 0) {
      this.message = 'Enter quantity greater than 0';
      return;
    }
    if (this.purchaseQty > selected.qty) {
      this.message = 'Not enough stock available';
      return;
    }

    this.productService.purchaseProduct(selected.id!, this.purchaseQty).subscribe({
      next: (res) => {
        this.message = res;
        this.productService.getProducts().subscribe((data: Product[]) => {
          this.products = data;
          this.cdr.detectChanges();
        });
      },
      error: (err) => {
        console.error('Error placing order:', err);
        this.message = 'Error placing order';
      }
    });
  }
}