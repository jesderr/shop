import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {environment} from "../core/environment";
import {Product} from "../models/Product.model";


@Injectable()
export class ProductService{
  protected readonly http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  getALlProducts(){
    const url = environment.getAllProduct;
    return this.http.get<Product[]>(url);
  }

  getProductById(productId : number){
    const url = this.urlWithProductId(environment.getProductById,productId);
    return this.http.get<Product>(url);
  }

  getProductByShopId(shopId : number){
    const url = this.urlWithShopId(environment.getAllProductsByShopId,shopId);
    return this.http.get<Product[]>(url);
  }

  private urlWithProductId(urlWithoutId: string, productId: number): string {
    return urlWithoutId.replace(':productId', `${productId}`);
  }

  private urlWithShopId(urlWithoutId: string, shopId: number): string {
    return urlWithoutId.replace(':shopId', `${shopId}`);
  }

}
