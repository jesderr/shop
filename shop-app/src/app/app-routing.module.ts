import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {HomeComponent} from "./home/home.component";
import {AddBuyerComponent} from "./buyer/add-buyer.component/add-buyer.component";
import {CheckBuyerComponent} from "./buyer/check-buyer.component/check-buyer.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'addBuyer', component: AddBuyerComponent},
  {path: 'checkBuyer', component: CheckBuyerComponent},
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
