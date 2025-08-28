import { Component, OnInit } from '@angular/core';
import { FoodService } from '../foodservice';
import { Food } from '../food';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-foodcomp',
  imports: [FormsModule],
  templateUrl: './foodcomp.html',
  styleUrl: './foodcomp.css'
})
export class FoodComponent implements OnInit {

  foods: Food[] = [];

  constructor(private foodService: FoodService, private router: Router) { }

  ngOnInit(): void {
    this.loadFoods();
  }

  loadFoods() {
    this.foodService.getAllFoods().subscribe({
      next: (data) => this.foods = data,
      error: (err) => console.error('Error fetching foods:', err)
    });
  }

  addFood() {
    this.router.navigate(['/foodadd']);
  }

  editFood(food: Food) {
    this.router.navigate(['/foodedit', food.id]);
  }

  deleteFood(food: Food) {
    this.foodService.deleteFood(food.id).subscribe(() => {
      this.foods = this.foods.filter(f => f.id !== food.id);
    });
  }
}