import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from './food';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  private baseUrl = 'http://localhost:9000/food';

  constructor(private http: HttpClient) { }

  getAllFoods(): Observable<Food[]> {
    return this.http.get<Food[]>(`${this.baseUrl}/all`);
  }

  addFood(food: Food): Observable<Food> {
    return this.http.post<Food>(`${this.baseUrl}/add`, food);
  }

  updateFood(food: Food): Observable<Food> {
    return this.http.put<Food>(`${this.baseUrl}/${food.id}`, food);
  }

  deleteFood(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}