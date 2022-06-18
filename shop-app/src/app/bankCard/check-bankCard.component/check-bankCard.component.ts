import {Component, OnInit} from "@angular/core";
import {ActivatedRoute, Router} from "@angular/router";
import {Buyer} from "../../models/buyer";
import {BuyerService} from "../../services/buyer.service";

@Component({
  templateUrl: './check-bankCard.component.html'
})
export class CheckBankCardComponent implements OnInit {

  public buyer: Buyer | undefined;


  constructor( private buyerService: BuyerService, private activatedRoute: ActivatedRoute) {
  }


  ngOnInit() {

  }
}
