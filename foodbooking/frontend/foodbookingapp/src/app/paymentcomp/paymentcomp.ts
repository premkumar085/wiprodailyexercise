import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PaymentService } from '../paymentservice';
import { Payment } from '../payment';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { OrderService } from '../orderservice';

@Component({
  selector: 'app-paymentcomp',
  imports: [FormsModule,CommonModule],
  templateUrl: './paymentcomp.html',
  styleUrl: './paymentcomp.css'
})
export class paymentcomp {

  constructor(private router : Router,
    private activatedRoute: ActivatedRoute,
    private paymentService: PaymentService,
    private orderService: OrderService

  ){}

  totalprice:number=0
  orderId:any=''
  modeOfPayment:string=''
  accountNumber:string=''
  cvv:number=0

  ngOnInit(){
    this.orderId = this.activatedRoute.snapshot.paramMap.get('orderId')
    let orderPrice = this.activatedRoute.snapshot.paramMap.get('orderPrice')
    this.totalprice = Number(orderPrice)
    console.log("this is order id-"+ this.orderId)
    console.log("this is order price ="+ orderPrice)
    console.log("this is total price-"+ this.totalprice)
  }

  pay(){
    let payment:Payment={
      orderId:this.orderId,
      totalOrderPrice:this.totalprice,
      modeOfPayment:this.modeOfPayment,
      accountNumber:this.accountNumber,
      cvv:this.cvv

    };
    this.orderService.pay(payment).subscribe((data)=>{
      console.log(data)
      this.router.navigate(['/success'])
    })
  }

}