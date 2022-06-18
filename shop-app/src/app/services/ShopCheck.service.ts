import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {ShopCheck} from "../models/shop-check";
import {CheckInfo} from "../models/check-info";
import {ProductCheck} from "../models/product-check";


@Injectable()
export class ShopCheckService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  createShopCheck(shopCheck : ShopCheck){
    const url = `http://localhost:8080/api/shopcheck/create`;
    return this.http.post<number>(url,shopCheck);
  }

  pay(checkInfo : CheckInfo){
    const url = `http://localhost:8080/api/shopcheck/pay`;
    return this.http.post<ProductCheck>(url,checkInfo);
  }

  getById(id: number){
    const url = `http://localhost:8080/api/shopcheck/${id}`;
    return this.http.get<ShopCheck>(url);
  }
}
