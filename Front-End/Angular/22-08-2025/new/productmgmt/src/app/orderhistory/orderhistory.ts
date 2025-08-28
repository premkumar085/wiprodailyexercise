import { Component, OnInit } from '@angular/core';
import { OrderService } from '../orderservice';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-orderhistory',
  imports: [CommonModule, FormsModule],
  templateUrl: './orderhistory.html',
  styleUrl: './orderhistory.css'
})
export class OrderHistoryComponent implements OnInit{
  orders: any[] = [];

  constructor(private orderService: OrderService) {}

  ngOnInit() {
    this.orderService.getOrderHistory().subscribe(data => this.orders = data);
  }

}