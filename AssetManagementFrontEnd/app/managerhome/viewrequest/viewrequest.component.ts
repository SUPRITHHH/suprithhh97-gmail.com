import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-viewrequest',
  templateUrl: './viewrequest.component.html',
  styleUrls: ['./viewrequest.component.css']
})
export class ViewrequestComponent implements OnInit {
  asset: [] = [];
  private term: number;
  it: any;

  constructor(private auth: AuthService) {
    // auth.getRequestData().subscribe(data => {
    //   this.asset = data.getManagerRequset;
    // }, err => {
    //   console.log(err);
    // }, () => {
    //   console.log('data got successfully');
    // });
  }


  doSearch(form: NgForm) {
    this.it = form.value.empno;
    console.log(this.it);
    this.auth.getRequestData(this.it).subscribe(data => {
     this.asset = data.getManagerRequset;
       }, err => {
         console.log(err);
       }, () => {
        console.log('data got successfully');
       });

  }

  ngOnInit() {
  }

}
