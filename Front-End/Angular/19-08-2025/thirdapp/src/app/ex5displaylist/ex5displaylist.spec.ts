import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex5displaylist } from './ex5displaylist';

describe('Ex5displaylist', () => {
  let component: Ex5displaylist;
  let fixture: ComponentFixture<Ex5displaylist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex5displaylist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex5displaylist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
