import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex3ngclass } from './ex3ngclass';

describe('Ex3ngclass', () => {
  let component: Ex3ngclass;
  let fixture: ComponentFixture<Ex3ngclass>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex3ngclass]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex3ngclass);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
