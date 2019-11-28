import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child5',
  templateUrl: './child5.component.html',
  styleUrls: ['./child5.component.css']
})
export class Child5Component implements OnInit {

  @Input() car: {imgUrl: string , name: string };
  constructor() { }

  ngOnInit() {
  }

}
