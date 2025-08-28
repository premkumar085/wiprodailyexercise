import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex4reactive } from './ex4reactive';

describe('Ex4reactive', () => {
  let component: Ex4reactive;
  let fixture: ComponentFixture<Ex4reactive>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex4reactive]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex4reactive);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
