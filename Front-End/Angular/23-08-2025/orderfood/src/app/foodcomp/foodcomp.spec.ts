import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Foodcomp } from './foodcomp';

describe('Foodcomp', () => {
  let component: Foodcomp;
  let fixture: ComponentFixture<Foodcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Foodcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Foodcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
