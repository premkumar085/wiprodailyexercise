import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { ProductService } from '../product-service';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-productedit',
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css'
})
export class Productedit implements OnInit {

  constructor(private activatedRoute: ActivatedRoute,private productService: ProductService,private router: Router,private cdr: ChangeDetectorRef) {}

  id: string | null = null;
  product: Product = {
    name: '',
    category: '',
    price: 0,
    qty: 0
  };

  ngOnInit() {
    console.log("==> Productedit Component Initialized");
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    if (this.id) {
      this.productService.findProduct(this.id).subscribe(prod => {
        console.log(prod);
        this.product = prod;
        this.cdr.detectChanges();
      }, error => {
        console.error('Error fetching product:', error);
      });
    }
  }

  save() {
    this.productService.saveProduct(this.product).subscribe({
      next: (product) => {
        console.log('Product saved successfully:', product);
        this.cdr.detectChanges();
        this.router.navigate(['/productlist']); // Navigate to list after save
      },
      error: (error) => {
        console.error('Error saving product:', error);
      }
    });
  }
}