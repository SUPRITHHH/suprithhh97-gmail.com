import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit , DoCheck ,AfterViewInit,AfterViewChecked ,OnDestroy{
  
  users;
  SelectedUser;
  Today = new Date();

  constructor( public service : UserService) {
    console.log('Constructor is Executed');
    this.getData();

   }

  

  ngOnInit() {
    console.log("ngOninit is Executed");
  }

  ngDoCheck(){
    console.log('ngDoCheck is Executed');
  }

  ngAfterViewInit(){
    console.log("ngAfterViewInit is Executed");
  }

  ngAfterViewChecked(){
    console.log("ngViewChecked is Executed");
  }

  ngOnDestroy(){
    console.log("ngOnDestroy is Executed");
  }

  loginData(form){
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);   
    },err =>{
      console.log(err);
    },()=>{
      console.log("Data Hosted Successfully");
    })
  }

 getData(){
   this.service.getUsers().subscribe(data => {
     console.log(data);
     this.users=data;
   },err => {
     console.log(err);
   }, () => {
     console.log('data got successful');
   })
 }

 deleteData(user){
   console.log(user);
   this.service.deleteUser(user.id).subscribe(data =>{
     console.log(data);
     this.getData();
   },err => {
     console.log(err);
   },() => {
     console.log("data deleted successfully");
   })
 }

 selectUser(user){
   console.log(user);
   this.SelectedUser=user;
 }

 UpdateData(form){
   console.log(form.value);
   this.service.updateUser(form.value.id,form.value).subscribe( data =>{
     console.log(data);
   },err =>{
     console.log(err);
   },()=> {
     console.log("data updation successfully");
   })
 }
}
