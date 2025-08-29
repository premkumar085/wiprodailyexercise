import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Paymentcomp } from './paymentcomp';

describe('Paymentcomp', () => {
  let component: Paymentcomp;
  let fixture: ComponentFixture<Paymentcomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Paymentcomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Paymentcomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
