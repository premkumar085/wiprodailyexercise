import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex5home } from './ex5home';

describe('Ex5home', () => {
  let component: Ex5home;
  let fixture: ComponentFixture<Ex5home>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex5home]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex5home);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
