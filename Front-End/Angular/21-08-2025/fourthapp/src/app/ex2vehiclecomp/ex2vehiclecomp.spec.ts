import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2vehiclecomp } from './ex2vehiclecomp';

describe('Ex2vehiclecomp', () => {
  let component: Ex2vehiclecomp;
  let fixture: ComponentFixture<Ex2vehiclecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2vehiclecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2vehiclecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
