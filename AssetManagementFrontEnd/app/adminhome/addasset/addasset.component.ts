import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from 'src/app/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addasset',
  templateUrl: './addasset.component.html',
  styleUrls: ['./addasset.component.css']
})
export class AddassetComponent implements OnInit, OnDestroy {

  error: string;
  constructor(private auth: AuthService, private route: Router) { }

  ngOnInit() {
  }

  addAssetData(form: NgForm) {
    this.error = null;
    this.auth.addAsset(form.value)
      .subscribe(res => {
        console.log(res);
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }

  ngOnDestroy() {
    this.error = null;
  }

  close() {
    this.route.navigateByUrl('/admin');
  }

}
