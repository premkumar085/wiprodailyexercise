import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15book } from './ex15book';

describe('Ex15book', () => {
  let component: Ex15book;
  let fixture: ComponentFixture<Ex15book>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15book]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15book);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
