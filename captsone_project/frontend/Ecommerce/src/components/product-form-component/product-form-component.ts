import { ChangeDetectionStrategy, ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Product } from '../../interfaces/product';
import { ProductService } from '../../services/product-service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-form-component',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './product-form-component.html',
  changeDetection: ChangeDetectionStrategy.OnPush,
  styleUrl: './product-form-component.css'
})
export class ProductFormComponent implements OnInit {
  product: Product = {
    prodName: '',
    prodDesc: '',
    prodCat: '',
    make: '',
    availableQty: 0,
    price: 0,
    uom: '',
    prodRating: 0,
    imageURL: '',
    dateOfManufacture: ''
  };

  isEditMode = false;
  errorMessage = '';

  constructor(
    private productService: ProductService,
    private router: Router,
    private route: ActivatedRoute,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
  const id = this.route.snapshot.params['id'];
  if (id) {
    this.isEditMode = true;
    this.productService.getProductById(+id).subscribe({
      next: (res) => {
        this.product = res;   
        this.cdr.markForCheck();
        console.log("Loaded product for edit:", this.product);
      },
      error: (err) => {
        this.errorMessage = 'Failed to load product.';
        console.error(err);
      }
    });
  }
}


save() {
  if (this.isEditMode) {
    if (!this.product.id) {
      this.errorMessage = 'Product ID is missing!';
      return;
    }
    this.productService.updateProduct(this.product.id, this.product).subscribe({
      next: () => this.router.navigate(['/admin-dashboard/products']),
      error: (err) => {
        this.errorMessage = 'Failed to update product.';
        console.error(err);
      }
    });
  } else {
    this.productService.saveProduct(this.product).subscribe({
      next: () => this.router.navigate(['/admin-dashboard/products']),
      error: (err) => {
        this.errorMessage = 'Failed to save product.';
        console.error(err);
      }
    });
  }
}

cancel() {
  this.router.navigate(['/admin-dashboard/products']);
}

}