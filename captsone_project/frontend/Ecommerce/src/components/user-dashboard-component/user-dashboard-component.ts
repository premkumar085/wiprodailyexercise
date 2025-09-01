import { Component, OnInit, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { AuthService } from '../../services/auth-service';
import { Router, RouterLink, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-dashboard-component',
  imports: [CommonModule, FormsModule, RouterLink,RouterOutlet],
  templateUrl: './user-dashboard-component.html',
  styleUrls: ['./user-dashboard-component.css'],
  standalone: true,
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class UserDashboardComponent implements OnInit {
  role: string | null = null;
  activeTab: 'products' | 'cart' | 'orders' = 'products';

  constructor(private auth: AuthService, 
    private router: Router, 
    private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.role = this.auth.getRole();
    this.cdr.markForCheck();
  }

  logout() {
    this.auth.logout();
    this.router.navigate(['/login']);
  }
}
