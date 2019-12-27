import { Component, OnInit, Input } from '@angular/core';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-rejectform',
  templateUrl: './rejectform.component.html',
  styleUrls: ['./rejectform.component.css']
})
export class RejectformComponent implements OnInit {

  @Input() asset;
  // tslint:disable-next-line: ban-types
  Reject: String = 'notapproved';
  constructor(private auth: AuthService) { }

  ngOnInit() {
    console.log(this.auth.request);
  }

  assetAllocationData1(form) {
    console.log(form.value);
    this. auth. rejectData(form.value).subscribe( data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data rejected successfully');
    });
  }

}
