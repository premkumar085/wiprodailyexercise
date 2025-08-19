import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Itaskex8 } from '../itaskex8';
import { Ex8task } from "../ex8task/ex8task";

@Component({
  selector: 'app-ex8tasklist',
  imports: [Ex8task],
  templateUrl: './ex8tasklist.html',
  styleUrl: './ex8tasklist.css'
})
export class Ex8tasklist {
  @Input() tasks: Itaskex8[] = [];
  @Output() remove = new EventEmitter<number>();

  removeTask(id: number) {
    this.remove.emit(id);
  }
}
