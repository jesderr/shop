import {Component, OnInit} from '@angular/core';
import {Shop} from "../../models/shop";
import {ShopService} from "../../services/Shop.service";
import {Product} from "../../models/product";
import {ProductService} from "../../services/Product.service";
import {ActivatedRoute, Router} from "@angular/router";
import {CheckInfo} from "../../models/check-info";
import {ShopCheckService} from "../../services/ShopCheck.service";
import {ProductCheck} from "../../models/product-check";


@Component({
  templateUrl: 'purchase.component.html',
})

export class PurchaseComponent implements OnInit {

  public products: Product[] = [];
  public shops: Shop[] = [];
  public selectedShop: Shop | undefined;
  private selectedProduct: Product | undefined;
  private buyerId: number | undefined;
  private productCheck: ProductCheck | undefined;

  constructor(private shopService: ShopService, private productService: ProductService,
              private activatedRoute: ActivatedRoute, private shopCheckService: ShopCheckService,
              private router: Router) {
  }

  ngOnInit() {
    this.shopService.getALlShops().subscribe(result => {
      this.shops = result;
    });

    this.activatedRoute.params.subscribe(buyerId =>{
      this.buyerId = Number(buyerId["id"]);
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

  payClick() {
    let checkInfo = new CheckInfo(this.selectedProduct?.id, this.buyerId);
    this.shopCheckService.pay(checkInfo).subscribe(productCheck =>{
      this.productCheck = productCheck;
      this.router.navigate(['/payInfo', this.productCheck]);
    });
  }
}

