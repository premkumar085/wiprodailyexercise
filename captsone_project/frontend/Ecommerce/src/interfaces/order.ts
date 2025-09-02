import { CartItem } from './cart-item';

export interface Order {
  orderId?: number;
  userId: number;
  productQuantityList: CartItem[];   
  totalAmount: number;
  orderStatus: string;
  orderDate: string;
}
