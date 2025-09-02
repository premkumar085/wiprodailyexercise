import { Component } from '@angular/core';
import { AuthService } from '../../services/auth-service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { SignupRequest } from '../../interfaces/signup-request';

@Component({
  selector: 'app-signup-component',
  imports: [FormsModule],
  templateUrl: './signup-component.html',
  styleUrl: './signup-component.css'
})
export class SignupComponent {
  payload: SignupRequest = {
    firstName: '',
    lastName: '',
    emailId: '',
    userId: '',
    passWord: '',
    address: '',
    userType: 1
  };

  constructor(private authService: AuthService, private router: Router) {}

  signup() {
    if (!this.payload.firstName || !this.payload.emailId || !this.payload.passWord) {
      alert('Please fill required fields');
      return;
    }

    this.authService.signup(this.payload).subscribe({
      next: () => {
        alert('Signup successful. Please login.');
        this.router.navigate(['/login']);
      },
      error: () => {
        alert('Signup failed');
      }
    });
  }
}