import { Routes } from '@angular/router';
import { ProductlistComponent } from './productlist/productlist';
import { ProductaddComponent } from './productadd/productadd';
import { ProducteditComponent } from './productedit/productedit';
import { ProductdeleteComponent } from './productdelete/productdelete';
import { OrderHistoryComponent } from './orderhistory/orderhistory';
import { OrderCompComponent } from './ordercomp/ordercomp';


export const routes: Routes = [
{ path: '', component: ProductlistComponent },
  { path: 'productlist', component: ProductlistComponent },
  { path: 'productadd', component: ProductaddComponent },
  { path: 'productedit/:id', component: ProducteditComponent },
  { path: 'productdelete/:id', component: ProductdeleteComponent },
  {path:'order', component:OrderCompComponent},
  {path:'orderhistory', component:OrderHistoryComponent}
];