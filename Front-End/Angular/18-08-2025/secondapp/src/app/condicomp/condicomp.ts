import { Component } from '@angular/core';
import{FormsModule} from '@angular/forms';


@Component({
  selector: 'app-condicomp',
  imports: [FormsModule],
  templateUrl: './condicomp.html',
  styleUrl: './condicomp.css'
})
export class Condicomp {

// ex-11
  isChecked: boolean = false; 
  toggle() {
    this.isChecked = !this.isChecked;
  }

  // ex-12

  countries: string[] = ["India", "USA", "Germany", "France", "Japan", "Brazil"];
  loadedCountries: string[] = [];  

  loadCountries() {
    this.loadedCountries = this.countries;
  }

}
