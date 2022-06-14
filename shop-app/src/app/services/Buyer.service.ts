import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Buyer} from "../models/buyer";
import {Observable} from "rxjs";


@Injectable()
export class BuyerService {
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlBuyers(): Observable<Buyer[]> {
    // здесь обращаемся к бекенду, который должен быть запущен и должен вернуть список байеров
    const url = 'http://localhost:8080/api/buyer/all';
    return this.http.get<Buyer[]>(url);
  }

  createBuyer(buyer: Buyer): Observable<number> {
    const url = 'http://localhost:8080/api/buyer/create';
    return this.http.post<number>(url, buyer);
  }

  getBuyerById(buyerId: number): Observable<Buyer> {
    const url = `http://localhost:8080/api/buyer/${buyerId}`;
    return this.http.get<Buyer>(url);
  }
}
