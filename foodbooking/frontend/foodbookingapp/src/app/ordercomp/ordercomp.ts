import { Component } from '@angular/core';
import { OrderService } from '../orderservice';
import { Router } from '@angular/router';
import { FoodService } from '../foodservice';
import { Food } from '../food';
import { OrderItem } from '../orderitem';
import { Order } from '../order';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ordercomp',
  imports: [FormsModule,CommonModule],
  templateUrl: './ordercomp.html',
  styleUrl: './ordercomp.css'
})
export class Ordercomp {
  removeItem(i: number) {
 this.cart.splice(i, 1)
}

  constructor(private orderService:OrderService, 
    private router:Router,
    private foodService:FoodService
  ){}


  foods:Food[] = [
    {id:0, foodName:"", description:'', image:'', price:0},
  ]
  cart:OrderItem[] = []
  selectedFoodId:number = 0
  order:Order = {
    items:[{foodId:0, quantity:0}]
  }
  totalPrice:number=0

  ngOnInit(){
    let token = localStorage.getItem("tokenValue")
    this.foodService.getFoods().subscribe((data)=>{
      this.foods = data;
    })
  }

  getFood(foodId:number){
    return this.foods.find(f=> f.id == foodId)
  }

 addItem(quantityInput:HTMLInputElement){
  if(!this.selectedFoodId) return;

  const quantity = Number.parseInt(quantityInput.value);
  if(!quantity || quantity<=0) return;

  // check if item already exists in cart
  const existing = this.cart.find(item=> item.foodId == this.selectedFoodId);
  if(existing){
    existing.quantity += quantity
  }else{
    const food = this.foods.find(f=> f.id== this.selectedFoodId);
    if(food){
        this.cart.push({foodId:food.id, quantity: quantity})
  }

  }
  this.selectedFoodId = 0;
  quantityInput.value = '' 
  this.totalPriceCalculation() 
}

  totalPriceCalculation(){

    this.totalPrice = this.cart.reduce(
      (sum, item)=>{
        const food = this.foods.find(f=> f.id == item.foodId);
        const price = food?.price ?? 0;
        return sum + item.quantity * price
      }, 0
    )

  }

  placeOrder() {
    console.log("token :" + localStorage.getItem('tokenValue'))
    this.order.items = this.cart
    console.log(this.order)
    this.orderService.save(this.order).subscribe((data)=>{
    console.log(data);
    this.order = data;
    this.router.navigate(['/payment'+'/'+data.id+'/'+this.order.orderValue])
    })
    
}
}