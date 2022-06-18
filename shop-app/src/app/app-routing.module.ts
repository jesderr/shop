import {RouterModule, Routes} from "@angular/router";
import {NgModule} from "@angular/core";
import {HomeComponent} from "./home/home.component";
import {AddBuyerComponent} from "./buyer/add-buyer.component/add-buyer.component";
import {CheckBuyerComponent} from "./buyer/check-buyer.component/check-buyer.component";
import {AddBankCardComponent} from "./bankCard/add-bankCard.component/add-bankCard.component";
import {CheckBankCardComponent} from "./bankCard/check-bankCard.component/check-bankCard.component";
import {PurchaseComponent} from "./purchases/choose-shop.component/purchase.component.";
import {PayInfoComponent} from "./pay-info/pay-info.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'addBuyer', component: AddBuyerComponent},
  {path: 'checkBuyer/:id', component: CheckBuyerComponent},
  {path: 'buyer/addBankCard/:id', component : AddBankCardComponent},
  {path: 'buyer/checkBankCard', component : CheckBankCardComponent},
  {path: 'buyer/back', component :HomeComponent},
  {path: 'purchase/:id', component: PurchaseComponent},
  {path: 'payInfo', component: PayInfoComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
