import { NgClass } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex2ngclass',
  imports: [NgClass],
  templateUrl: './ex2ngclass.html',
  styleUrl: './ex2ngclass.css'
})
export class Ex2ngclass {
  flag1 = true;  
  flag2 = true;  

}
