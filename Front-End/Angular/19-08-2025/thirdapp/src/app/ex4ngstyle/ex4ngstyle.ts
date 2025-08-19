import { NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex4ngstyle',
  imports: [NgStyle],
  templateUrl: './ex4ngstyle.html',
  styleUrl: './ex4ngstyle.css'
})
export class Ex4ngstyle {
  color1 = 'green';
  fontSize1 = '20px';

  flag1 = true;

}
