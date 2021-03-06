import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingComponent } from './landing/landing.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { UploadproductComponent } from './uploadproduct/uploadproduct.component';
import { HelpComponent } from './help/help.component';
import { ForgotComponent } from './forgot/forgot.component';
import { ContactComponent } from './contact/contact.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { EditproductComponent } from './editproduct/editproduct.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ShowproductComponent } from './showproduct/showproduct.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { DeleteproductComponent } from './deleteproduct/deleteproduct.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { UpdateOrdersComponent } from './update-orders/update-orders.component';
import { RetrieveOrdersComponent } from './retrieve-orders/retrieve-orders.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { LogoutComponent } from './logout/logout.component';
import { FilterPipe } from './filter.pipe';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    SignupComponent,
    UploadproductComponent,
    HelpComponent,
    ForgotComponent,
    ContactComponent,
    PrivacyComponent,
    EditproductComponent,
    DashboardComponent,
    ShowproductComponent,
    DeleteproductComponent,
    StoreOrdersComponent,
    UpdateOrdersComponent,
    RetrieveOrdersComponent,
    DeleteOrdersComponent,
    LogoutComponent,
    FilterPipe,
    CustomerDashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,FormsModule,ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
