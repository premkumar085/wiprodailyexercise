import { DatePipe, UpperCasePipe } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { Ex3ctofPipe } from "./ex3ctof-pipe";
import { Ex4colordir } from './ex4colordir';

@Component({
  selector: 'app-root',
  imports: [UpperCasePipe, FormsModule, DatePipe, Ex3ctofPipe,Ex4colordir],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipedirdemo');

  Text: string = '';

  // ex-2
  Date: Date | null = null;

  // ex-3
   celsius: number = 0;


}
