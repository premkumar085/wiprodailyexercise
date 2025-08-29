import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ordercomp } from './ordercomp';

describe('Ordercomp', () => {
  let component: Ordercomp;
  let fixture: ComponentFixture<Ordercomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ordercomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ordercomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
