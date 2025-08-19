import { Component, EventEmitter, Input, Output } from '@angular/core';
import { IFruitmodifyex6 } from '../ifruitmodifyex6';

@Component({
  selector: 'app-ex5displaylist',
  imports: [],
  templateUrl: './ex5displaylist.html',
  styleUrl: './ex5displaylist.css'
})
export class Ex5displaylist {
@Input() fruit: IFruitmodifyex6 = {
    name: '',
    description: '',
    image: ''
  };

  @Output() btnClick = new EventEmitter<string>();

  onClick(fruitName: string) {
    console.log("Clicked - " + fruitName);
    this.btnClick.emit(fruitName);
  }
}
