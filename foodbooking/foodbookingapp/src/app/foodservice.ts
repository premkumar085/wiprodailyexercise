import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from './food';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor(private http:HttpClient, 
  ){}

  foodUrl:string = 'http://localhost:9010/food'

  getFoods():Observable<Food[]>{
    return this.http.get<Food[]>(this.foodUrl)
  }

  addFoods(foods:Food):Observable<Food>{
    return this.http.post<Food>(this.foodUrl, foods)
  }

  deleteFood(id:number){
    return this.http.delete(`${this.foodUrl}/${id}`)
  }


  
}
