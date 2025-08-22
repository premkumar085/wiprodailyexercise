import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { Router, RouterLink } from '@angular/router';
import { ProductService } from '../product-service';

@Component({
  selector: 'app-productlist',
  imports: [RouterLink],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css'
})
export class Productlist implements OnInit {

  constructor(private productService: ProductService, private router: Router, private cdr: ChangeDetectorRef) { }

  products: Product[] = [];

  ngOnInit() {
    console.log("==> Productlist Component Initialized");
    this.productService.getProducts().subscribe((data: Product[]) => {
      this.products = data;
      console.log('Products fetched successfully:', data);
      this.cdr.detectChanges();
    }, (error) => {
      console.error('Error fetching products:', error);
    });
  }

  addProduct() {
    this.router.navigate(['/productadd']);
  }
}