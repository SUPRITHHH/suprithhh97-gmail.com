import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewmanagerrequest',
  templateUrl: './viewmanagerrequest.component.html',
  styleUrls: ['./viewmanagerrequest.component.css']
})
export class ViewmanagerrequestComponent implements OnInit {

  asset: [] = [];
  SelectedUser: any;
  // tslint:disable-next-line: ban-types
  SelectedUser1: String = 'approved';
  // tslint:disable-next-line: ban-types
  SelectedUser2: String = 'notapproved';

  SelectedUser3: any;

  constructor(private auth: AuthService, private route: Router) {
    auth.getRaiseRequestData().subscribe(data => {
      this.asset = data.assestRequest;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }

  ngOnInit() {
  }

  selectUser(assets) {
    console.log(assets);
    this.SelectedUser = assets;
    // tslint:disable-next-line: no-unused-expression
    this.SelectedUser1;
  }

  assetAllocationData(form) {
    console.log(form.value);
    this. auth. allocateData(form.value).subscribe( data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data allocation successfully');
    });
  }

  RejectUser(assets) {
    this.auth.request = assets;
    this.route.navigate(['/rejectform']);

  }

  close(){
    this.route.navigateByUrl('/admin');
  }

  }


