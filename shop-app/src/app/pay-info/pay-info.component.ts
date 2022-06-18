import {Component, OnInit} from "@angular/core";
import {ActivatedRoute} from "@angular/router";
import {ProductCheck} from "../models/product-check";
import {ShopCheckService} from "../services/ShopCheck.service";
import {BuyerService} from "../services/buyer.service";
import {ProductService} from "../services/Product.service";
import {ShopCheck} from "../models/shop-check";
import {Product} from "../models/product";
import {Buyer} from "../models/buyer";

@Component({
  templateUrl: "./pay-info.component.html"
})

export class PayInfoComponent implements OnInit {

  public shopCheck: ShopCheck | undefined;
  public product: Product | undefined;
  public buyer: Buyer | undefined;

  constructor(private activatedRoute: ActivatedRoute, private shopCheckService: ShopCheckService,
              private buyerService: BuyerService, private productService: ProductService) {
  }

  ngOnInit() {
    this.activatedRoute.params.subscribe(p => {
      let productCheck = p as ProductCheck;
      this.productService.getProductById(productCheck.productId!).subscribe(product => {
        this.product = product;
      });
      this.shopCheckService.getById(productCheck.shopCheckId!).subscribe(shopCheck => {
        this.shopCheck = shopCheck;
        this.buyerService.getBuyerById(this.shopCheck.buyerId!).subscribe(buyer => {
          this.buyer = buyer;
        });
      });
    });
  }

}
