import { ChangeDetectionStrategy, ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Order } from '../../interfaces/order';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { OrderService } from '../../services/order-service';

@Component({
  selector: 'app-order-list-component',
  standalone: true,
  imports: [FormsModule,CommonModule],
  changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './order-list-component.html',
  styleUrl: './order-list-component.css'
  
})
export class OrderListComponent implements OnInit {
  orders: Order[] = [];

  constructor(private orderService: OrderService,
    private cdr:ChangeDetectorRef,) {}

  ngOnInit(): void {
    this.loadOrders();
  }

  loadOrders() {
  this.orderService.getOrders().subscribe({
    next: (res) => {
      this.orders = res;
      this.cdr.markForCheck(); 
    },
    error: (err) => console.error(err)
  });
}
}