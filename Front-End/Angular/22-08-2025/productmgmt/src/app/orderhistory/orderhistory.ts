import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { ProductService } from '../product-service';
import { Order } from '../order';

@Component({
  selector: 'app-orderhistory',
  imports: [],
  templateUrl: './orderhistory.html',
  styleUrl: './orderhistory.css'
})
export class Orderhistory implements OnInit {

  orders: Order[] = [];

  constructor(private productService: ProductService, private cdr: ChangeDetectorRef) {}

  ngOnInit() {
    this.productService.getOrders().subscribe((data: any[]) => {
      this.orders = data;
      this.cdr.detectChanges();
    }, error => {
      console.error('Error loading orders:', error);
    });
  }
}
