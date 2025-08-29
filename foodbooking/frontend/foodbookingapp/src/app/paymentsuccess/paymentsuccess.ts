import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-paymentsuccess',
  imports: [],
  templateUrl: './paymentsuccess.html',
  styleUrl: './paymentsuccess.css'
})
export class PaymentSuccess {

  constructor(private router: Router){}

  backFoodList(){
    this.router.navigate(['/food'])
  }
}