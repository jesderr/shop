import {Component,OnInit} from '@angular/core';
import {Buyer} from "../models/Buyer.model";

@Component({
  templateUrl: './home.component.html',
  styleUrls:['./home.component.css']
})

export class HomeComponent implements OnInit{

  public buyer: Buyer;

  constructor(buyer: Buyer) {
    this.buyer = buyer;
  }

  openFormToBuyer() {
    open()
  }

  ngOnInit() {
  }
}
