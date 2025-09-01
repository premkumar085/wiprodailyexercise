export interface Token {
  token: string;
  role: 'ADMIN' | 'CUSTOMER' | string;
  userId: number;
}
