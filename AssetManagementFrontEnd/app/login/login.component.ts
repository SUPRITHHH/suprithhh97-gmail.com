import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;
  msg: string;

  constructor(private auth: AuthService, private router: Router) { }

  ngOnInit() {
  }

  loginData(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of login', data);
      if (data && data.message === 'login successfull') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/');
      } else {
        this.msg = JSON.stringify(data.message);
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }

  home() {
    this.router.navigateByUrl('/');
  }




}


