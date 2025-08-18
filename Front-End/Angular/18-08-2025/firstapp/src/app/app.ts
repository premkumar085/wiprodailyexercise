import { Component, signal } from '@angular/core';
import { Secondcomp } from './secondcomp/secondcomp';
import { Login } from "./login/login";

@Component({
  selector: 'app-root',
  imports: [Secondcomp, Login],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('firstapp');
}
