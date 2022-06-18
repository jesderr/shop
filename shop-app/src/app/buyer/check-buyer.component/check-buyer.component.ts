import {Component} from "@angular/core";
import {BuyerService} from "../../services/buyer.service";
import {BankCard} from "../../models/bank-card";
import {Buyer} from "../../models/buyer";
import {BankCardService} from "../../services/BankCard.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  templateUrl: './check-buyer.component.html'
})
export class CheckBuyerComponent {


  public buyer: Buyer | undefined;

  buyerId: number | undefined;


  constructor(private buyerService: BuyerService,
              private bankCardService: BankCardService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
  }

  ngOnInit() {
    this.activatedRoute.params.subscribe(value => {
      this.buyerId = Number(value["id"]);
    });

    this.buyerService.getBuyerById(this.buyerId!).subscribe((result: Buyer) => {
      this.buyer = result;
    });

  }

  continueClick() {
    this.router.navigate(['/purchase/',this.buyerId]);
  }
}
