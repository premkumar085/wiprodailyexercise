import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex3reactive } from './ex3reactive';

describe('Ex3reactive', () => {
  let component: Ex3reactive;
  let fixture: ComponentFixture<Ex3reactive>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex3reactive]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex3reactive);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
