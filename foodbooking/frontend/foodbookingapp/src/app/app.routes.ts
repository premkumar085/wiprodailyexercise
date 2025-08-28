import { Routes } from '@angular/router';
import { Login } from './login/login';
import { FoodList } from './foodlist/foodlist';
import { UserRegister } from './user-register/user-register';

export const routes: Routes = [
    {path: '' , component : Login},
    {path: 'login', component: Login},
    {path:'food', component:FoodList}
];
