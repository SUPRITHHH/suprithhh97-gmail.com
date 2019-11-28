import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-bindings',
  templateUrl: './event-bindings.component.html',
  styleUrls: ['./event-bindings.component.css']
})
export class EventBindingsComponent implements OnInit {

   InputData = "";

  constructor() {}

  ngOnInit() {
  }

  PrintAlertmessage(){
    alert("Hi Hello");
  }

  dataInput(event){
    console.log(event.target.value);
    this.InputData=event.target.value;
  }
}
