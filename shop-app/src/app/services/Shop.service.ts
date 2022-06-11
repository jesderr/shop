import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {environment} from "../core/environment";
import {Shop} from "../models/Shop.model";


@Injectable()
export class ShopService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlShops(){
    const url = environment.getAllShops;
    return this.http.get<Shop[]>(url);
  }

  getShopById(shopId : number){
    const url = this.urlWithShopId(environment.getShopById,shopId);
    return this.http.get<Shop>(url);
  }

  private urlWithShopId(urlWithoutId: string, shopId: number): string {
    return urlWithoutId.replace(':shopId', `${shopId}`);
  }
}
