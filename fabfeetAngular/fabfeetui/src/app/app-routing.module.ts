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

import { CategoryretrieveComponent } from './categoryretrieve/categoryretrieve.component';
import { CategoryupdateComponent } from './categoryupdate/categoryupdate.component';
import { CategorydeleteComponent } from './categorydelete/categorydelete.component';
import {SupplierretrieveComponent} from './supplierretrieve/supplierretrieve.component';
import { SupplierupdateComponent } from './supplierupdate/supplierupdate.component';
import { SupplierdeleteComponent } from './supplierdelete/supplierdelete.component';
import { CategorystoreComponent } from './categorystore/categorystore.component';
import { SupplierstoreComponent } from './supplierstore/supplierstore.component';

const routes: Routes = [
  {path: '', component: DashboardComponent},


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

  {path: 'orders/show', component:RetrieveOrdersComponent},

  {path: 'orders/show', component:RetrieveOrdersComponent}


  //components for manvi

{path:'category/retrieve',component:CategoryretrieveComponent},
{path:'category/update',component:CategoryupdateComponent},
{path:'category/delete',component:CategorydeleteComponent},
{path:'category/store',component:CategorystoreComponent},

{path:'supplier/retrieve',component:SupplierretrieveComponent},
{path:'supplier/update',component:SupplierupdateComponent},
{path:'supplier/delete',component:SupplierdeleteComponent},
{path:'supplier/store',component:SupplierstoreComponent}



  //comoponents for ravishankar
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
