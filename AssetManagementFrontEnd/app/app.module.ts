import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ManagerhomeComponent } from './managerhome/managerhome.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { AddemployeeComponent } from './adminhome/addemployee/addemployee.component';
import { AddassetComponent } from './adminhome/addasset/addasset.component';
import { UpdateassetComponent } from './adminhome/updateasset/updateasset.component';
import { HttpClientModule } from '@angular/common/http';
import { AssetallocationComponent } from './adminhome/assetallocation/assetallocation.component';
import { RaiserequestComponent } from './managerhome/raiserequest/raiserequest.component';

import { ViewmanagerrequestComponent } from './adminhome/viewmanagerrequest/viewmanagerrequest.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { ViewrequestComponent } from './managerhome/viewrequest/viewrequest.component';
import { AdminsinglepageComponent } from './adminsinglepage/adminsinglepage.component';
import { ViewassetComponent } from './adminhome/viewasset/viewasset.component';
import { HomeComponent } from './home/home.component';
import { AuthguardService } from './authguard.service';
import { HeaderComponent } from './header/header.component';
import { RejectformComponent } from './adminhome/rejectform/rejectform.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ManagerhomeComponent,
    AdminhomeComponent,
    AddemployeeComponent,
    AddassetComponent,
    UpdateassetComponent,

    AssetallocationComponent,
    RaiserequestComponent,

    ViewassetComponent,
    ViewmanagerrequestComponent,
    ViewrequestComponent,
    AdminsinglepageComponent,
    HomeComponent,
    HeaderComponent,
    RejectformComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'addemployee', component: AddemployeeComponent },
      { path: 'addasset', component: AddassetComponent },
      { path: 'updateasset', component: UpdateassetComponent },
      { path: 'allocateasset', component: AssetallocationComponent },
      { path: 'viewasset', component: ViewassetComponent },
      {
        path: 'admin', component: AdminsinglepageComponent,
        canActivate: [AuthguardService], data: { roles: ['ADMIN'] }
      },
      {
        path: 'manager', component: ManagerhomeComponent,
        canActivate: [AuthguardService], data: { roles: ['MANAGER'] }
      },
      { path: 'login', component: LoginComponent },
      { path: 'viewmanagerrequest', component: ViewmanagerrequestComponent },
      { path: 'raiseform', component: RaiserequestComponent },
      { path: 'requestlist', component: ViewrequestComponent },
      { path: 'rejectform', component: RejectformComponent },
    ])

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
