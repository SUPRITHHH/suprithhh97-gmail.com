import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  Tree = [
    {
      img1 : "https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg",
      name : "FLOWER1",
      price : 200,

    },{

      img1 : "https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg",
      name : "FLOWER2",
      price : 300,

    },{

      img1 : "https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg",
      name : "FLOWER3",
      price : 400
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
