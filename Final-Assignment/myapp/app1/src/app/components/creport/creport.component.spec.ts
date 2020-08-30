import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreportComponent } from './creport.component';

describe('CreportComponent', () => {
  let component: CreportComponent;
  let fixture: ComponentFixture<CreportComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
