import { Component,  } from '@angular/core';
import { Ex8task } from '../ex8task/ex8task';
import { Itaskex8 } from '../itaskex8';
import { FormsModule,  } from '@angular/forms';
import { Ex8tasklist } from "../ex8tasklist/ex8tasklist";

@Component({
  selector: 'app-ex8home',
  imports: [FormsModule, Ex8tasklist],
  templateUrl: './ex8home.html',
  styleUrl: './ex8home.css'
})
export class Ex8home {
  tasks: Itaskex8[] = [
    { id: 1, description: 'Complete Angular Assignment', category: 'Study' },
    { id: 2, description: 'Morning Jogging', category: 'Exercise' },
    { id: 3, description: 'Team Meeting', category: 'Work' }
  ];

  newDescription: string = '';
  newCategory: string = 'Work';
  idCounter: number = 4;

  addTask() {
    if (this.newDescription.trim() === '') return;

    const newTask: Itaskex8 = {
      id: this.idCounter++,
      description: this.newDescription,
      category: this.newCategory
    };

    console.log("Task Added - " + newTask.description);
    this.tasks.push(newTask);

    this.newDescription = '';
    this.newCategory = 'Work';
  }

  remove(taskId: number) {
    console.log("Remove button clicked - " + taskId);
    this.tasks = this.tasks.filter(task => task.id !== taskId);
  }
}
