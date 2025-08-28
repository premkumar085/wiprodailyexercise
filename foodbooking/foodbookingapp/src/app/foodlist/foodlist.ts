import { ChangeDetectorRef, Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { FoodService } from '../foodservice';
import { Food } from '../food';

@Component({
  selector: 'app-foodlist',
  imports: [FormsModule],
  templateUrl: './foodlist.html',
  styleUrl: './foodlist.css'
})
export class FoodList {

  foods:Food[] = []

  constructor(private router: Router,
    private foodService: FoodService,
    private cdr: ChangeDetectorRef
  ){}

  ngOnInit(): void {
  this.foodService.getFoods().subscribe({
    next: (data) => {
      console.log('Foods from backend:', data); 
      this.foods = data;
    },
    error: (err) => console.error('Error fetching foods:', err)
  });
}

}