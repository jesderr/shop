import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";


@Injectable()
export class BuyerService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

}
