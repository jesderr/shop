import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {HomeComponent} from "./home/home.component";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {CommonModule} from "@angular/common";
import {AppRoutingModule} from './app-routing.module';
import {BuyerService} from "./services/buyer.service";
import {AddBuyerComponent} from "./buyer/add-buyer.component/add-buyer.component";
import {BankCardService} from "./services/BankCard.service";
import {ProductService} from "./services/Product.service";
import {ShopService} from "./services/Shop.service";
import {ShopCheckService} from "./services/ShopCheck.service";
import {AddBankCardComponent} from "./bankCard/add-bankCard.component/add-bankCard.component";
import {CheckBuyerComponent} from "./buyer/check-buyer.component/check-buyer.component";
import {CheckBankCardComponent} from "./bankCard/check-bankCard.component/check-bankCard.component";
import {PurchaseComponent} from "./purchases/choose-shop.component/purchase.component.";
import {PayInfoComponent} from "./pay-info/pay-info.component";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CheckBuyerComponent,
    AddBuyerComponent,
    AddBankCardComponent,
    CheckBankCardComponent,
    PurchaseComponent,
    PayInfoComponent
  ],

  imports: [
    CommonModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    BuyerService,
    BankCardService,
    ProductService,
    ShopService,
    ShopCheckService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
