import { Routes } from '@angular/router';
import { Login } from './login/login';
import { FoodComponent } from './foodcomp/foodcomp';

export const routes: Routes = [
    { path: 'login', component: Login },
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'food', component: FoodComponent },
  { path: 'foods', component: FoodComponent },
  { path: 'foodedit/:id', component: FoodComponent },
  { path: 'foodadd', component: FoodComponent },
  { path: '', redirectTo: '/foods', pathMatch: 'full' }
];
