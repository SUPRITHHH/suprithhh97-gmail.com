import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RejectformComponent } from './rejectform.component';

describe('RejectformComponent', () => {
  let component: RejectformComponent;
  let fixture: ComponentFixture<RejectformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RejectformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RejectformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
