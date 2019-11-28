import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent4',
  templateUrl: './parent4.component.html',
  styleUrls: ['./parent4.component.css']
})
export class Parent4Component implements OnInit {

  selectedMobile;

  mobiles = [
      {
        imgUrl :'https://cdn.pixabay.com/photo/2019/09/27/01/23/iphone-4507288__340.jpg',
        name : 'MOBILE1'
      },
      {
        imgUrl : 'https://cdn.pixabay.com/photo/2019/08/19/17/04/iphone-xr-4416978__340.jpg',
        name :'MOBILE2'
      },
      {
        imgUrl :'https://cdn.pixabay.com/photo/2019/08/12/13/29/hand-4401249__340.jpg',
        name :'MOBILE3'
      },
      {
        imgUrl :'https://cdn.pixabay.com/photo/2019/08/07/05/45/app-4389881__340.jpg',
        name :'MOBILE4'
      },

    ];

    sendMobile(mobile){
      console.log(mobile);
      this.selectedMobile=mobile;
    }
  constructor() { }

  ngOnInit() {
  }

}
