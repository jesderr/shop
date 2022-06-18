import {Component, OnInit} from "@angular/core";
import {BankCard} from "../../models/bank-card";
import {ActivatedRoute, Router} from "@angular/router";
import {Buyer} from "../../models/buyer";
import {BankCardService} from "../../services/BankCard.service";

@Component({
  templateUrl: './add-bankCard.component.html'
})
export class AddBankCardComponent implements OnInit {

  public bankCard: BankCard | undefined;
  buyerId: number | undefined;

  constructor(private activatedRoute: ActivatedRoute,
              private bankCardService: BankCardService, private router: Router) {
  }

  ngOnInit() {
    this.activatedRoute.params.subscribe(value => {
      this.buyerId = Number(value["id"]);
    });
  }

  createBankCardClick() {
    let code = (<HTMLInputElement>document.getElementById('code')).value;
    let actionTime = (<HTMLInputElement>document.getElementById('actionTime')).value;
    let cvv = (<HTMLInputElement>document.getElementById('cvv')).value;
    let cardHolder = (<HTMLInputElement>document.getElementById('cardHolder')).value;
    let bankCard = new BankCard(Number(code), Number(cvv), actionTime, cardHolder);
    this.bankCardService.createCardForBuyer(bankCard, this.buyerId!).subscribe(bankCardId => {
      this.router.navigate(['/checkBuyer/', this.buyerId]);
    });

  }
}
