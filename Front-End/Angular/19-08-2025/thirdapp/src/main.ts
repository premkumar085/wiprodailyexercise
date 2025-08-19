import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Ex1home } from './app/ex1home/ex1home';
import { Ex1displaylist } from './app/ex1displaylist/ex1displaylist';
import { Ex2ngclass } from './app/ex2ngclass/ex2ngclass';
import { Ex3ngclass } from './app/ex3ngclass/ex3ngclass';
import { Ex4ngstyle } from './app/ex4ngstyle/ex4ngstyle';
import { Ex5home } from './app/ex5home/ex5home';
import { Ex8home } from './app/ex8home/ex8home';

bootstrapApplication(Ex8home, appConfig)
  .catch((err) => console.error(err));
