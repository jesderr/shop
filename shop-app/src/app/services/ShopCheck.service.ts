import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {ShopCheck} from "../models/ShopCheck.model";
import {CheckInfo} from "../models/CheckInfo.model";


@Injectable()
export class ShopCheckService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  createShopCheck(shopCheck : ShopCheck){

  }

  createProductCheck(checkInfo : CheckInfo){

  }
}
