import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Login } from './app/login/login';
import { FoodComponent } from './app/foodcomp/foodcomp';

bootstrapApplication(App,appConfig)
  .catch((err) => console.error(err));
