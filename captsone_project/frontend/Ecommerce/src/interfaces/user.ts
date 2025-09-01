export interface User {
  id?: number;
  firstName?: string;    
  lastName?: string;
  emailId: string;
  userId?: string;
  passWord: string;
  address?: string;
  userType?: number;    
  salt?: string;
}
