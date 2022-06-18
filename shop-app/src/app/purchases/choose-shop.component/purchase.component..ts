import {Component, OnInit} from '@angular/core';
import {Shop} from "../../models/shop";
import {ShopService} from "../../services/Shop.service";
import {Product} from "../../models/product";
import {ProductService} from "../../services/Product.service";


@Component({
  templateUrl: 'purchase.component.html',
})

export class PurchaseComponent implements OnInit {

  public shops: Shop[] = [];
  public selectedShop: Shop | undefined;
  public products: Product[] = [];
  public selectedProduct: Product | undefined;

  constructor(private shopService: ShopService, private productService: ProductService) {
  }

  ngOnInit() {
    this.shopService.getALlShops().subscribe(result => {
      this.shops = result;
    });
  }

  shopChange(event: any) {
    const currentShopName = event.srcElement.value;
    this.selectedShop = this.shops.find(b => b.name === currentShopName);

    this.productService.getProductByShopId(this.selectedShop?.id!).subscribe(result =>{
      this.products = result;
    });
  }

  productChange(event: any) {
    const currentProductName = event.srcElement.value;
    this.selectedProduct = this.products.find(b => b.name === currentProductName);
  }
}

