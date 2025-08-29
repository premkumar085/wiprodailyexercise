import { Routes } from '@angular/router';
import { Login } from './login/login';
import { paymentcomp } from './paymentcomp/paymentcomp';
import { UserRegister } from './user-register/user-register';
import { Ordercomp } from './ordercomp/ordercomp';
import { PaymentSuccess } from './paymentsuccess/paymentsuccess';
import { FoodListcomp } from './foodlist/foodlist';

export const routes: Routes = [
     {path: '' , component : Login},
    {path: 'login', component: Login},
    {path:'food', component:FoodListcomp},
    {path: 'login/register', component: UserRegister},
    {path:'order', component:Ordercomp},
    {path:'payment/:orderId/:orderPrice', component: paymentcomp},
     {path: 'success', component: PaymentSuccess}
];
