import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AuthService } from './auth-service';
import { Cart } from '../interfaces/cart';
import { Observable } from 'rxjs';
import { ORDER_BASE_URL } from './util/appconstant';

@Injectable({ providedIn: 'root' })
export class CartService {
  constructor(private http: HttpClient, private authService: AuthService) {}

  private getHeaders() {
    return {
      headers: new HttpHeaders({
        Authorization: `Bearer ${this.authService.getToken()}`,
        'Content-Type': 'application/json'
      })
    };
  }

  addOrUpdateCart(cart: Cart): Observable<Cart> {
    return this.http.post<Cart>(`${ORDER_BASE_URL}/orders/cart`, cart, this.getHeaders());
  }

  getCartByUser(userId: number): Observable<Cart> {
    return this.http.get<Cart>(`${ORDER_BASE_URL}/orders/cart/${userId}`, this.getHeaders());
  }

  removeFromCart(cartId: number): Observable<void> {
    return this.http.delete<void>(`${ORDER_BASE_URL}/orders/cart/${cartId}`, this.getHeaders());
  }

  clearCart(userId: number): Observable<void> {
    return this.http.delete<void>(`${ORDER_BASE_URL}/orders/cart/${userId}`, this.getHeaders());
  }
}
