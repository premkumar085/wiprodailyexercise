import { ChangeDetectorRef, Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { UserService } from '../userservice';
import { User } from '../user';

@Component({
  selector: 'app-user-register',
  imports: [RouterLink,FormsModule],
  templateUrl: './user-register.html',
  styleUrl: './user-register.css'
})
export class UserRegister {

  constructor(private router: Router,
    private userService: UserService,
    private cdr: ChangeDetectorRef
  ){}

  newUser:User={
    userName:'',
    userEmail: '',
    passWord:''
  }

  repeatPassword:string=''

  ngOnInit(){
    this.cdr.detectChanges()
  }

  register(){
    if(this.repeatPassword!= this.newUser.passWord){
      alert("Passwords don't match...")
    }else{
      this.userService.createUser(this.newUser).subscribe(()=>{
        this.router.navigate(['/login'])
  })
    }
 
  }

}
