import { CommonModule } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatListModule } from '@angular/material/list';
import { MatStepperModule } from '@angular/material/stepper';

@Component({
  selector: 'app-root',
  imports: [MatListModule, CommonModule,
    ReactiveFormsModule,
    MatStepperModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule, FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('fifthapp');
// ex-1
  // cities: string[] = ['Hyderabad', 'Bengaluru', 'Chennai', 'Mumbai', 'Delhi', 'Kolkata'];

// ex-2

  // isLinear = true;

  // nameGroup: FormGroup;
  // ageGroup: FormGroup;
  // emailGroup: FormGroup;

  // constructor(private fb: FormBuilder) {
  //   this.nameGroup = this.fb.group({
  //     name: ['', Validators.required]
  //   });

  //   this.ageGroup = this.fb.group({
  //     age: ['', Validators.required]
  //   });

  //   this.emailGroup = this.fb.group({
  //     email: ['', Validators.required]
  //   });
  // }

  // submit(): void {
  //   alert(
  //     `Name: ${this.nameGroup.value.name}\nAge: ${this.ageGroup.value.age}\nEmail: ${this.emailGroup.value.email}`
  //   );
  // }




  // v-2

  name: string = '';
  age: string = '';
  email: string = '';

  submit() {
    alert(`Name: ${this.name}\nAge: ${this.age}\nEmail: ${this.email}`);
  }
}

