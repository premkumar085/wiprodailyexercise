import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './order';
import { BASE_URL } from './util/appconst';
import { Payment } from './payment';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  
  constructor(private http:HttpClient){}

  save(order:Order):Observable<Order>{
    let token = localStorage.getItem('tokenValue')
    let header:HttpHeaders = new HttpHeaders()
    const headers = new HttpHeaders()
    .set('Content-Type' , 'application/json')
    .set('Authorization', `${token}`)
    let url:string = BASE_URL+'/orders' 
    return this.http.post<Order>(url, order, {headers})
  }

  getOrders():Observable<Order[]>{
    return this.http.get<Order[]>(BASE_URL+'/orders')
  }

  pay(payment:Payment):Observable<Payment>{
    let token = localStorage.getItem('tokenValue')
    let header:HttpHeaders = new HttpHeaders()
    const headers = new HttpHeaders()
    .set('Content-Type' , 'application/json')
    .set('Authorization', `${token}`)
    let url:string = BASE_URL+'/orders/pay'
    return this.http.post<Payment>(url, payment, {headers})
  }


}