import { Component, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AuthService } from '../../services/auth-service';
import { LoginRequest } from '../../interfaces/login-request';

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.html',
  styleUrls: ['./login-component.css'],
  standalone: true,
  imports: [FormsModule, CommonModule],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class LoginComponent {
  payload: LoginRequest = { emailId: '', passWord: '' };
  errorMessage = '';

  constructor(public authService: AuthService, private router: Router, private cdr: ChangeDetectorRef) {}

login() {
  this.errorMessage = '';
  this.authService.login(this.payload).subscribe({
  next: (res) => {
    const token = res.token.startsWith('Bearer ') ? res.token.substring(7) : res.token;
    this.authService.saveToken(token, res.role, res.userId);

      if (res.role === 'ADMIN') {
        this.router.navigate(['/admin-dashboard']);
      } else {
        this.router.navigate(['/user-dashboard']);
      }

      this.cdr.markForCheck();
    },
    error: () => {
      this.errorMessage = 'Invalid credentials';
      this.cdr.markForCheck();
    }
  });
}
}