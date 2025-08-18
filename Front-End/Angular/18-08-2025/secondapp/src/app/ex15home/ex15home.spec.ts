import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15home } from './ex15home';

describe('Ex15home', () => {
  let component: Ex15home;
  let fixture: ComponentFixture<Ex15home>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15home]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15home);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
