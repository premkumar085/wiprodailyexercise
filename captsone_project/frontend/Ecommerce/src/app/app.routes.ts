import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';

import { LoginComponent } from '../components/login-component/login-component';
import { SignupComponent } from '../components/signup-component/signup-component';
import { UserDashboardComponent } from '../components/user-dashboard-component/user-dashboard-component';
import { AdminDashboardComponent } from '../components/admin-dashboard-component/admin-dashboard-component';
import { ProductListComponent } from '../components/product-list-component/product-list-component';
import { ProductFormComponent } from '../components/product-form-component/product-form-component';
import { CartComponent } from '../components/cart-component/cart-component';
import { OrderListComponent } from '../components/order-list-component/order-list-component';

export const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },

  {
  path: 'admin-dashboard',
  component: AdminDashboardComponent,
  children: [
    { path: 'products', component: ProductListComponent },
    { path: 'product/add', component: ProductFormComponent },
    { path: 'product/edit/:id', component: ProductFormComponent },
    { path: 'orders', component: OrderListComponent },
    { path: '', redirectTo: 'products', pathMatch: 'full' },
  ]
},

  {
    path: 'user-dashboard',
    component: UserDashboardComponent,
    children: [
      { path: 'products', component: ProductListComponent },
      { path: 'cart', component: CartComponent },
      { path: 'orders', component: OrderListComponent },
      { path: '', redirectTo: 'products', pathMatch: 'full' },
    ]
  },

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
