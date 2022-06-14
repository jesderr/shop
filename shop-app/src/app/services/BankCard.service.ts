import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {environment} from "../core/environment";
import {BankCard} from "../models/bank-card";
import {Observable} from "rxjs";


@Injectable()
export class BankCardService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlBankCards(): Observable<BankCard[]>{
    const url = 'http://localhost:8080/api/bankcard/all';
    return this.http.get<BankCard[]>(url);
  }

  getCardById(bankCardId : number){
    const url = `http://localhost:8080/api/bankcard/${bankCardId}`;
    return this.http.get<BankCard>(url);
  }

  createCardForBuyer(bankCard : BankCard, buyerId : number){
    const url = `http://localhost:8080/api/bankcard/createBankCard${buyerId}`;
    return this.http.post<number>(url,bankCard);
  }
}
