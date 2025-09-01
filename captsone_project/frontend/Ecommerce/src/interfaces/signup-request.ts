export interface SignupRequest {
  firstName: string;
  lastName?: string;
  emailId: string;
  userId?: string;
  passWord: string;
  address?: string;
  userType?: number; 
}
