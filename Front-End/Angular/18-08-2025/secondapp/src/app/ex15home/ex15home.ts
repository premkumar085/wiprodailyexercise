import { Component } from '@angular/core';
import { Ex15book } from "../ex15book/ex15book";

@Component({
  selector: 'app-ex15home',
  imports: [],
  templateUrl: './ex15home.html',
  styleUrl: './ex15home.css'
})
export class Ex15home {
  books = [
    { title: 'Book 1', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 2', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 3', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 4', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 5', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 6', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 7', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 8', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 9', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 10', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 11', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 12', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 13', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 14', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 15', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 16', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 17', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 18', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 19', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' },
    { title: 'Book 20', image: 'https://th.bing.com/th/id/OIP.3knv5SF1UQqw4SgYRB1EdAAAAA?w=115&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3' }
  ];
}
