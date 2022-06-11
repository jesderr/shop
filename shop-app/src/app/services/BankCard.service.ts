import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {environment} from "../core/environment";
import {BankCard} from "../models/BankCard.model";


@Injectable()
export class BankCardService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlBankCards(){
    const url = environment.getAllBankCard;
    return this.http.get<BankCard[]>(url);
  }

  createBankCard(bankCard : BankCard){

  }

  getCardById(bankCardId : number){
    const url = this.urlWithBankCardId(environment.getBankCardById,bankCardId);
    return this.http.get<BankCard>(url);
  }

  createCardForBuyer(bankCard : BankCard, bankCardId : number){

  }

  private urlWithBankCardId(urlWithoutId: string, bankCardId: number): string {
    return urlWithoutId.replace(':bankCardId', `${bankCardId}`);
  }
}
