import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Listcomp } from './app/listcomp/listcomp';
import { Condicomp } from './app/condicomp/condicomp';
import { Switchdemo } from './app/switchdemo/switchdemo';
import { Ex14filterdemo } from './app/ex14filterdemo/ex14filterdemo';
import { Ex15book } from './app/ex15book/ex15book';
import { Ex15home } from './app/ex15home/ex15home';

bootstrapApplication(Ex15home, appConfig)
  .catch((err) => console.error(err));
