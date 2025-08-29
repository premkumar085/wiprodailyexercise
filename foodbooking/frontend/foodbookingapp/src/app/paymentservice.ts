import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BASE_URL } from './util/appconst';
import { Payment } from './payment';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private http:HttpClient){}

  savePayment(payment:Payment):Observable<Payment>{
    let  token=localStorage.getItem("tokenValue");
    // console.log("jwt token="+token)
     let header:HttpHeaders  = new HttpHeaders()

       const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `${token}`)
      let url:string= BASE_URL+ "/payment";
    return this.http.post<Payment>(url, payment,{headers})
  }
  
}