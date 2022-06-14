import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Product} from "../models/product";


@Injectable()
export class ProductService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlProducts(){
    const url = 'http://localhost:8080/api/product/all';
    return this.http.get<Product[]>(url);
  }

  getProductById(productId : number){
    const url = `http://localhost:8080/api/product/${productId}`;
    return this.http.get<Product>(url);
  }

  getProductByShopId(shopId : number){
    const url = `http://localhost:8080/api/product/shop/${shopId}`;
    return this.http.get<Product[]>(url);
  }
}
