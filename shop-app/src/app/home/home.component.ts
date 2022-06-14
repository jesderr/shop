import {Component, OnInit} from '@angular/core';
import {BuyerService} from "../services/buyer.service";
import {Buyer} from "../models/buyer";

@Component({
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {

  public buyers: Buyer[] = [];

  constructor(private buyerService: BuyerService) {
  }

  ngOnInit() {
    // здесь обращаемся к сервису buyerService и вызываем метод достать всех байеров
    this.buyerService.getALlBuyers().subscribe((result: Buyer[]) => {
      this.buyers = result;
    });
  }
}
