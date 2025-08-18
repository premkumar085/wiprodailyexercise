import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex14filterdemo } from './ex14filterdemo';

describe('Ex14filterdemo', () => {
  let component: Ex14filterdemo;
  let fixture: ComponentFixture<Ex14filterdemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex14filterdemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex14filterdemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
