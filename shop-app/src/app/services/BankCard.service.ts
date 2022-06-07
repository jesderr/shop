import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";


@Injectable()
export class BankCardService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

}
