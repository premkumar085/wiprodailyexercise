import { Component } from '@angular/core';
import { User } from '../user';
import { UserService } from '../userservice';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
email: string = '';
  password: string = '';

  constructor(private userService: UserService) {}

  onLogin() {
  const user = {
    email: this.email,
    passWord: this.password
  };

  this.userService.login(user).subscribe({
    next: (res: any) => {
      console.log('Login success:', res);

      localStorage.setItem('token', res.token);

      alert('Login Successful');
      window.location.href = '/food';
    },
    error: (err) => {
      console.error('Login failed:', err);
      alert('Invalid credentials or server error');
    }
  });
}
}