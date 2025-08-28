import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex3reactive',
  imports: [ReactiveFormsModule],
  templateUrl: './ex3reactive.html',
  styleUrl: './ex3reactive.css'
})
export class Ex3reactive {
  fName = new FormControl('');
  reversedText: string = '';

  constructor() {
    this.fName.valueChanges.subscribe((value) => {
      if (value) {
        this.reversedText = value.split('').reverse().join('');
      } else {
        this.reversedText = '';
      }
    });
  }

}
