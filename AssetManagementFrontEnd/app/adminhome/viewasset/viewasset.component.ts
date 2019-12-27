import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';


@Component({
  selector: 'app-viewasset',
  templateUrl: './viewasset.component.html',
  styleUrls: ['./viewasset.component.css']
})
export class ViewassetComponent implements OnInit {

   // tslint:disable-next-line: ban-types

  // tslint:disable-next-line: ban-types
  asset: [] = [];
  SelectedUser: any;


  constructor(private auth: AuthService) {

    auth.getData().subscribe(data => {
      this.asset = data.assests;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }

  ngOnInit() {
  }

  selectUser(org) {
    console.log(org);
    this.SelectedUser = org;
  }


  UpdateData(form) {
    console.log(form.value);
    this. auth. updateAsset(form.value).subscribe( data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updation successfully');
    });
  }

}
