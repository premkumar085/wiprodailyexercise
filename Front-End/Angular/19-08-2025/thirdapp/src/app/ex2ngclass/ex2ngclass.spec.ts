import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2ngclass } from './ex2ngclass';

describe('Ex2ngclass', () => {
  let component: Ex2ngclass;
  let fixture: ComponentFixture<Ex2ngclass>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2ngclass]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2ngclass);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
