import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-bindings',
  templateUrl: './property-bindings.component.html',
  styleUrls: ['./property-bindings.component.css']
})

export class PropertyBindingsComponent implements OnInit {

  name:string = 'SUPRITH';

  imgUrl='https://cdn.pixabay.com/photo/2019/09/27/00/50/beach-4507253__340.jpg';

  address:string = 'Mallikarjuna Nagar';

  colorName:string = "yellow";

  isActive : boolean = false ;

  Colspan:number = 2 ;


  constructor() {}

  ngOnInit()  {
    setInterval(()=>{
    
    this.colorName = 'red';
    
    this.isActive = !this.isActive ;

  },2000)

}

}





