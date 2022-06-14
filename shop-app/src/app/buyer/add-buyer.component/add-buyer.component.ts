import {Component, OnInit} from "@angular/core";
import {Buyer} from "../../models/buyer";
import {BankCard} from "../../models/bank-card";
import {BankCardService} from "../../services/BankCard.service";

@Component({
  templateUrl: './add-buyer.component.html'
})
export class AddBuyerComponent implements OnInit {
  public bankCard: BankCard;
  public buyer: Buyer;
  public name: String;
  public surname: String;
  public gender: String;


  constructor(buyer: Buyer, name: String, surname: String,
              gender: String, private BankCardService: BankCardService, bankCard : BankCard) {
    this.buyer = buyer;
    this.name = name;
    this.surname = surname;
    this.gender = gender;
    this.bankCard = bankCard;//????
  }

  ngOnInit() {
    // не очень понял как передвать Id в такие методы ещё не очень понял нужно ли передавать в конструктор BankCard
    //this.BankCardService.getCardById(this.bankCard.id).subscribe((result: ba ) => {
      //this.buyers = result;
    //});
  }
}
