import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent3',
  templateUrl: './parent3.component.html',
  styleUrls: ['./parent3.component.css']
})
export class Parent3Component implements OnInit {

  selectedLaptop;

  laptops = [
      {
        imgUrl :'https://cdn.pixabay.com/photo/2018/09/24/13/32/desk-3699950__340.jpg',
        name : 'LAPTOP1'
      },
      {
        imgUrl : 'https://cdn.pixabay.com/photo/2015/06/05/16/18/technology-798619__340.jpg',
        name :'LAPTOP2'
      },
      {
        imgUrl :'https://cdn.pixabay.com/photo/2015/01/08/18/27/startup-593337__340.jpg',
        name :'LAPTOP3'
      },
      {
        imgUrl :'https://cdn.pixabay.com/photo/2015/01/08/18/25/startup-593329__340.jpg',
        name :'LAPTOP4'
      },

    ];

    sendLaptop(laptop){
      console.log(laptop);
      this.selectedLaptop=laptop;
    }
  constructor() { }

  ngOnInit() {
  }

}
