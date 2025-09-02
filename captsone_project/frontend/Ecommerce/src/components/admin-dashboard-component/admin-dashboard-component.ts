import { Component, OnInit, ChangeDetectionStrategy, ChangeDetectorRef } from '@angular/core';
import { Router, RouterLink, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AuthService } from '../../services/auth-service';

@Component({
  selector: 'app-admin-dashboard-component',
  templateUrl: './admin-dashboard-component.html',
  styleUrls: ['./admin-dashboard-component.css'],
  standalone: true,
  imports: [CommonModule, FormsModule, RouterLink,RouterOutlet],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class AdminDashboardComponent implements OnInit {
  role: string | null = null;
  activeTab: 'products' | 'orders' = 'products';

  constructor(private auth: AuthService, private router: Router, private cdr: ChangeDetectorRef) {}

  ngOnInit(): void {
    this.role = this.auth.getRole();
    this.cdr.markForCheck();
  }

  logout() {
    this.auth.logout();
    this.router.navigate(['/login']);
  }
}
