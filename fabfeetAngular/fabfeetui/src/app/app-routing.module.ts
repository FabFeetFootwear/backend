import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { DeleteproductComponent } from './deleteproduct/deleteproduct.component';
import { EditproductComponent } from './editproduct/editproduct.component';
import { ForgotComponent } from './forgot/forgot.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { RetrieveOrdersComponent } from './retrieve-orders/retrieve-orders.component';
import { ShowproductComponent } from './showproduct/showproduct.component';
import { SignupComponent } from './signup/signup.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { UpdateOrdersComponent } from './update-orders/update-orders.component';
import { UploadproductComponent } from './uploadproduct/uploadproduct.component';

const routes: Routes = [
  {path: '',component:CustomerDashboardComponent},
  {path: 'home', component: DashboardComponent},
  {path: 'login', component: LoginComponent},
  {path: 'signup', component: SignupComponent},
  {path: 'contactus', component: ContactComponent},
  {path: 'privacy', component: PrivacyComponent},
  {path: 'help', component: HelpComponent},
  {path: 'forgot', component: ForgotComponent},
  {path: 'new', component: UploadproductComponent},
  {path: 'edit/:id', component: EditproductComponent},
  {path: 'delete/:id', component: DeleteproductComponent},
  {path: 'show/:id', component: ShowproductComponent},

  //components for aharna {path: 'orders/edit', component:OrdereditComponent}
  {path: 'orders/new',component:StoreOrdersComponent},
  {path: 'orders/update',component:UpdateOrdersComponent},
  {path: 'orders/delete', component:DeleteOrdersComponent},
  {path: 'orders/show', component:RetrieveOrdersComponent}
  


  //components for manvi


  //comoponents for ravishankar
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
