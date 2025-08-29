import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { FoodService } from '../foodservice';
import { Food } from '../food';
import { Order } from '../order';
import { OrderService } from '../orderservice';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-foodlist',
  imports: [FormsModule,CommonModule],
  templateUrl: './foodlist.html',
  styleUrls: ['./foodlist.css']
})
export class FoodListcomp {

  foods:Food[] = []

  constructor(private router: Router,
    private foodService: FoodService,
    private cdr: ChangeDetectorRef
  ){}

  ngOnInit(): void {

    let tokendata:any=localStorage.getItem("tokenValue");
    if(tokendata==null)
    {
        this.router.navigate(["/login"])
    }

  this.foodService.getFoods().subscribe({
    next: (data) => {
      console.log('Foods from backend:', data);  
      this.foods = data;
      this.cdr.detectChanges();
    },
    error: (err) => console.error('Error fetching foods:', err)
  });
}
logout(){
    localStorage.removeItem('token')
    this.router.navigate(['/login'])
    
  }

  toCart(){
    this.router.navigate(['/orders'])
  }

  orderNow(food: Food) {
  console.log("Ordering food:", food);
  // navigate to order page or add to cart logic
}



}