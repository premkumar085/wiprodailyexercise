import { NgClass } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex3ngclass',
  imports: [NgClass],
  templateUrl: './ex3ngclass.html',
  styleUrl: './ex3ngclass.css'
})
export class Ex3ngclass {
  flag1 = true;
  flag2 = true;

  getNgClass() {
    return {
      'app1': this.flag1,
      'app2': this.flag2
    };
  }

}
