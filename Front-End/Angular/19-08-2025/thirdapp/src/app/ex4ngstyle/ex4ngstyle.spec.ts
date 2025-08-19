import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex4ngstyle } from './ex4ngstyle';

describe('Ex4ngstyle', () => {
  let component: Ex4ngstyle;
  let fixture: ComponentFixture<Ex4ngstyle>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex4ngstyle]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex4ngstyle);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
