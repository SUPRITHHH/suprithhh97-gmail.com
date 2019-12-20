import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrls: ['./parent2.component.css']
})
export class Parent2Component implements OnInit {

  selectedBike;

  bikes = [
      {
        imgUrl :'https://cdn.pixabay.com/photo/2015/06/18/13/42/super-bikes-813701__340.jpg',
        name : 'BIKE1'
      },
      {
        imgUrl :'https://cdn.pixabay.com/photo/2016/07/20/19/07/superbike-1531024__340.jpg',
        name :'BIKE2'
      },
      {
        imgUrl :'https://image.shutterstock.com/image-photo/motorcycle-practice-leaning-into-fast-260nw-209851810.jpg',
        name :'BIKE3'
      },
      {
        imgUrl :'https://image.shutterstock.com/image-photo/motorcycle-practice-leaning-into-fast-260nw-199353026.jpg',
        name :'BIKE4'
      },

    ];

    sendBike(bike){
      console.log(bike);
      this.selectedBike=bike;
    }
  
  constructor() { }

  ngOnInit() {
  }

}
