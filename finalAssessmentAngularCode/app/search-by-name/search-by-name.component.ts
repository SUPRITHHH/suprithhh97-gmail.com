import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-by-name',
  templateUrl: './search-by-name.component.html',
  styleUrls: ['./search-by-name.component.css']
})
export class SearchByNameComponent implements OnInit {

  product1: any;
  Product: [] = [];
  constructor(private auth: AuthService) {

   }

  ngOnInit() {
  }

  doSearch(form: NgForm) {
    this.product1 = form.value.name;
    console.log(this. product1);
    this.auth. getData(this. product1).subscribe(data => {
     this.Product = data.products;
       }, err => {
         console.log(err);
       }, () => {
        console.log('data got successfully');
       });

  }


}
