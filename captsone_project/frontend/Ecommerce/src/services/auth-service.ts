import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { USER_BASE_URL } from './util/appconstant';
import { LoginRequest } from '../interfaces/login-request';
import { SignupRequest } from '../interfaces/signup-request';
import { Token } from '../interfaces/token';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private http: HttpClient) {}

  login(payload: LoginRequest): Observable<Token> {
    return this.http.post<Token>(`${USER_BASE_URL}/user/login`, payload);
  }

  signup(payload: SignupRequest): Observable<any> {
    return this.http.post(`${USER_BASE_URL}/user/signup`, payload);
  }

saveToken(token: string, role: string, userId?: number) {
  localStorage.setItem("token", token);
  localStorage.setItem("role", role);
  if (userId !== undefined) {
    localStorage.setItem("userId", userId.toString());
  }
}


getUserId(): number {
  return Number(localStorage.getItem('userId'));
}

  getToken(): string | null {
    return localStorage.getItem('token');
  }

  getRole(): string | null {
    return localStorage.getItem('role');
  }

  logout() {
    localStorage.removeItem('token');
    localStorage.removeItem('role');
  }
}