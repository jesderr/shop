import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {environment} from "../core/environment";
import {Buyer} from "../models/Buyer.model";


@Injectable()
export class BuyerService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlBuyers(){
    const url = environment.getAllBuyers;
    return this.http.get<Buyer[]>(url);
  }

  createBuyer(buyer : Buyer){

  }

  getBuyerById(buyerId : number){
    const url = this.urlWithBuyerId(environment.getBuyerById,buyerId);
    return this.http.get<Buyer>(url);
  }

  private urlWithBuyerId(urlWithoutId: string, buyerId: number): string {
    return urlWithoutId.replace(':buyerId', `${buyerId}`);
  }

}
