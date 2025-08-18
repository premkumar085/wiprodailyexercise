import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-ex14filterdemo',
  imports: [FormsModule],
  templateUrl: './ex14filterdemo.html',
  styleUrl: './ex14filterdemo.css'
})
export class Ex14filterdemo {
   searchText = '';
  names = ['Jayanta', 'Jayaram', 'Rahul', 'Sneha', 'Kiran', 'Anita'];

  get filtered(): string[] {
    const q = this.searchText.trim().toLowerCase();
    return this.names.filter(n => n.toLowerCase().startsWith(q));
  }
}
