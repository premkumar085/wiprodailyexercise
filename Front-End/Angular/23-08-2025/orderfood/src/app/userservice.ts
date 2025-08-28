import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private baseUrl = 'http://localhost:9000/user';

  constructor(private http: HttpClient) {}

  login(user: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/login`, user, {
      headers: { 'Content-Type': 'application/json' }
    });
  }

  register(user: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/register`, user, {
      headers: { 'Content-Type': 'application/json' }
    });
  }
}