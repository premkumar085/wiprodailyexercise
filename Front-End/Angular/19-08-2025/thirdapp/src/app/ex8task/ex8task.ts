import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Itaskex8 } from '../itaskex8';

@Component({
  selector: 'app-ex8task',
  standalone: true,
  imports: [],
  templateUrl: './ex8task.html',
  styleUrls: ['./ex8task.css']
})
export class Ex8task {
  @Input() task: Itaskex8 = {
    id: 0,
    description: '',
    category: ''
  };

  @Output() btnClick = new EventEmitter<number>();

  onClick(taskId: number) {
    console.log("Clicked - " + taskId);
    this.btnClick.emit(taskId);
  }
}
