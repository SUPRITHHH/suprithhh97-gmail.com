import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RoyComponent } from './1.assignment/assignment1.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './Help/help.component';
import { AboutComponent } from './About/about.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingsComponent } from './data-binding/property-bindings/property-bindings.component';
import { EventBindingsComponent } from './data-binding/event-bindings/event-bindings.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { Assignment2Component } from './assignment2/assignment2.component';
import { Form1Component } from './assignment2/form1/form1.component';
import { Form2Component } from './assignment2/form2/form2.component';
import { Form3Component } from './assignment2/form3/form3.component';
import { Form4Component } from './assignment2/form4/form4.component';
// import { RegisterPageComponent } from './register-page/register-page.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';



@NgModule({
  declarations: [
    AppComponent,
    // HeaderComponent,
    HomeComponent,
    RoyComponent,
    HelpComponent,
    AboutComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingsComponent,
    EventBindingsComponent,
    TwoWayBindingComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    Assignment2Component,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
  ],

  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
       {path:'About',component:AboutComponent} ,
       {path:'Help',component:HelpComponent},
       {path:'property-binding',component:PropertyBindingsComponent},
       {path:'event-binding',component: EventBindingsComponent},
       {path:'two-way-binding',component: TwoWayBindingComponent},
       {path:'ngif',component: NgIfComponent},
       {path:'ngfor',component:NgForComponent},
       {path:'ngswitch',component:NgSwitchComponent},
       {path:'register',component:RegisterComponent},
       {path:'form1',component:Form1Component},
       {path:'form2',component:Form2Component},
       {path:'form3',component:Form3Component},
       {path:'form4',component:Form4Component},
       {path:'reactive-form',component:ReactiveFormComponent},
       {path:'parent',component:ParentComponent},
       {path:'comment-details',component: CommentDetailsComponent}
    ])
  ],
  providers: [],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
