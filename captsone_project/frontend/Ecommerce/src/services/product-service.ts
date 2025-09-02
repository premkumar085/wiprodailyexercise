import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../interfaces/product';
import { Observable } from 'rxjs';
import { PRODUCT_BASE_URL } from './util/appconstant';
import { AuthService } from './auth-service';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private http: HttpClient, private authService: AuthService) {}

  private getHeaders(): HttpHeaders {
    const token = this.authService.getToken();
    return new HttpHeaders({
      'Content-Type': 'application/json',
      Authorization: token ? `Bearer ${token}` : ''
    });
  }

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(`${PRODUCT_BASE_URL}/products`, { headers: this.getHeaders() });
  }

  getProductById(id: number): Observable<Product> {
    return this.http.get<Product>(`${PRODUCT_BASE_URL}/products/${id}`, { headers: this.getHeaders() });
  }

  saveProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(`${PRODUCT_BASE_URL}/products`, product, { headers: this.getHeaders() });
  }

  updateProduct(id: number, product: Product): Observable<Product> {
  return this.http.put<Product>(`${PRODUCT_BASE_URL}/products/${id}`, product, { headers: this.getHeaders() });
  }

  deleteProduct(id: number): Observable<void> {
    return this.http.delete<void>(`${PRODUCT_BASE_URL}/products/${id}`, { headers: this.getHeaders() });
  }
}
