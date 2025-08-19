import { Component } from '@angular/core';
import { Ex1home } from '../ex1home/ex1home';

@Component({
  selector: 'app-ex1displaylist',
  imports: [],
  templateUrl: './ex1displaylist.html',
  styleUrl: './ex1displaylist.css'
})
export class Ex1displaylist {
  fruits = [
    {
      name: 'Apple',
      image: 'https://tse4.mm.bing.net/th/id/OIP.gxVIhxEKV2L4dkBjwptXjwHaHa?r=0&rs=1&pid=ImgDetMain&o=7&rm=3',
      description: 'Apples are nutritious and great for health.'
    },
    {
      name: 'Banana',
      image: 'https://tse2.mm.bing.net/th/id/OIP.O8lKDwWSZP_Cfm8eeyw3wAHaFu?r=0&rs=1&pid=ImgDetMain&o=7&rm=3',
      description: 'Bananas are rich in potassium.'
    },
    {
      name: 'Mango',
      image: 'https://th.bing.com/th/id/OIP.gwXcLEef4R1vdOqlgr2RrAHaHa?w=174&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7',
      description: 'Mango is known as the king of fruits.'
    },
    { 
      name: 'Watermelon', 
      image: 'https://tse1.mm.bing.net/th/id/OIP.kh2qdvKJp89ePy4YFLBeJwHaFj?r=0&rs=1&pid=ImgDetMain&o=7&rm=3',
      description: 'Watermelons are refreshing in summer.' 
    }

  ];

}
