import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from "@angular/material/input";
import { MatSelectModule } from '@angular/material/select';

@Component({
  selector: 'app-ex4reactive',
  imports: [ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSelectModule,
    MatButtonModule],
  templateUrl: './ex4reactive.html',
  styleUrl: './ex4reactive.css'
})
export class Ex4reactive {
  fg: FormGroup;

  subjects = ['Maths', 'Physics', 'Chemistry', 'Biology'];

  constructor(private fb: FormBuilder) {
    this.fg = this.fb.group({
      fName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      dob: ['', Validators.required],
      subject: ['', Validators.required]
    });
  }

  onSubmit() {
    console.log("onSubmit");
    if (this.fg.valid) {
      console.log("form submitted", this.fg.value);
    }
  }
}
