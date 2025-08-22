import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ex2vehiclecomp } from "./ex2vehiclecomp/ex2vehiclecomp";

@Component({
  selector: 'app-root',
  imports: [Ex2vehiclecomp],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('fourthapp');
}
