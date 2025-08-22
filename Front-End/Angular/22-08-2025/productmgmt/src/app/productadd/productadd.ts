import { ChangeDetectorRef, Component } from '@angular/core';
import { ProductService } from '../product-service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { Product } from '../product';

@Component({
  selector: 'app-productadd',
  imports: [FormsModule],
  templateUrl: './productadd.html',
  styleUrl: './productadd.css'
})
export class Productadd {

  constructor(private productService: ProductService, private router: Router, private cdr: ChangeDetectorRef) { }

  productName: string = '';
  productCategory: string = '';
  productPrice: number | null = null;
  productQty: number | null = null; 

  submit() {
    console.log('Adding product:', this.productName, this.productCategory, this.productPrice, this.productQty);

    this.productService.addProduct({
      name: this.productName,
      category: this.productCategory,
      price: this.productPrice ?? 0,
      qty: this.productQty ?? 0
    }).subscribe(response => {
      console.log('Product added successfully:', response);
      this.productName = '';
      this.productCategory = '';
      this.productPrice = null;
      this.productQty = null;
      this.cdr.detectChanges();
      this.router.navigate(['/productlist']); 
    }, error => {
      console.error('Error adding product:', error);
    });
  }
}