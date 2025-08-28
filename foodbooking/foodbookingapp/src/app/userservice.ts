import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { JwtToken } from './jwt-token';
import { User } from './user';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient){}

   private url:string = "http://localhost:9000/user"

  login(user:User):Observable<JwtToken>{
    console.log('in the user service')
    return this.http.post<JwtToken>(`${this.url}/login`, user)
  }

  getUser():Observable<User[]>{
    return this.http.get<User[]>(this.url)
  }

  createUser(user:User):Observable<void>{
    return this.http.post<void>(`${this.url}/login/register`, user)
  }
  
}