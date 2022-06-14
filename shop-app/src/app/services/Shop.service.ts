import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Shop} from "../models/shop";


@Injectable()
export class ShopService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlShops(){
    const url = 'http://localhost:8080/api/shop/all';
    return this.http.get<Shop[]>(url);
  }

  getShopById(shopId : number){
    const url = `http://localhost:8080/api/shop/${shopId}`;
    return this.http.get<Shop>(url);
  }
}
