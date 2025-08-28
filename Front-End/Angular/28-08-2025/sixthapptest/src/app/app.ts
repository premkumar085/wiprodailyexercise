import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('sixthapptest');

  isPalindrome(str: string): boolean {
  str = str.toLowerCase(); 
  for (let i = 0; i < str.length / 2; i++) {
    if (str[i] !== str[str.length - 1 - i]) {
      return false;
    }
  }
  return true;
}

  
  // add(a: number, b: number): number {
  //   return a + b;
  // }

  // multiply(a: number, b: number): number {
  //   return a * b;
  // }
}

