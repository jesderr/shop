import {Component, OnInit} from "@angular/core";
import {Buyer} from "../../models/buyer";
import {BuyerService} from "../../services/buyer.service";
import {Router} from "@angular/router";

@Component({
  templateUrl: './add-buyer.component.html'
})
export class AddBuyerComponent implements OnInit {
  public buyer: Buyer | undefined;


  constructor(private buyerService: BuyerService, private router: Router) {
  }


  ngOnInit() {
  }

  createBuyerClick() {
    let name = (<HTMLInputElement>document.getElementById('name')).value;
    let surname = (<HTMLInputElement>document.getElementById('surname')).value;
    let gender = (<HTMLInputElement>document.getElementById('gender')).value;
    let buyer = new Buyer(name, surname, gender);
    this.buyerService.createBuyer(buyer).subscribe(buyerId => {
      this.buyer = buyer;
      this.buyer.id = buyerId;
    });
  }

  createBankCardClick() {
    this.router.navigate(['/buyer/addBankCard/', this.buyer!.id]);
  }

  continueClick() {
    this.router.navigate(['/purchase']);
  }
}
