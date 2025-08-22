import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';
import { Order } from './order';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  constructor(private http:HttpClient) { }

  getProducts():Observable<Product[]>  {
    let url:string="http://localhost:9000/products";
    return this.http.get<Product[]>(url);
  }

  addProduct(product: Product): Observable<Product> {
    let url:string="http://localhost:9000/products";
    return this.http.post<Product>(url, product);
  }

  deleteProduct(id: string): Observable<void> {
    let url:string=`http://localhost:9000/products/${id}`;
    return this.http.delete<void>(url);
  }

  findProduct(id: string): Observable<Product> {
    let url:string=`http://localhost:9000/products/${id}`;
    return this.http.get<Product>(url);
  }

  saveProduct(product: Product): Observable<Product> {
    let url:string=`http://localhost:9000/products`;
    return this.http.put<Product>(url, product);
  }

  // ex-3
  purchaseProduct(id: number, qty: number): Observable<string> {
   
    const url = `http://localhost:9000/products/${id}/purchase?qty=${qty}`;
    return this.http.post(url, {}, { responseType: 'text' });
  }


  placeOrder(order: Order): Observable<Order> {
    let url:string="http://localhost:9000/orders";
    return this.http.post<Order>(url, order);
  }

  getOrders():Observable<Order[]> {
    let url:string="http://localhost:9000/orders";
    return this.http.get<Order[]>(url);
  }
}
