import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex3reactive } from './app/ex3reactive/ex3reactive';
import { Ex4reactive } from './app/ex4reactive/ex4reactive';

bootstrapApplication(Ex4reactive, appConfig)
  .catch((err) => console.error(err));
