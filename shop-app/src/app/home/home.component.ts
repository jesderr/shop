import {Component, OnInit} from '@angular/core';
import {BuyerService} from "../services/buyer.service";
import {Buyer} from "../models/buyer";
import {Router} from "@angular/router";

@Component({
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})

export class HomeComponent implements OnInit {

  public buyers: Buyer[] = [];

  selectedBuyer: Buyer | undefined;

  constructor(private buyerService: BuyerService, private router: Router) {
  }

  ngOnInit() {
    // здесь обращаемся к сервису buyerService и вызываем метод достать всех байеров
    this.buyerService.getALlBuyers().subscribe((result: Buyer[]) => {
      this.buyers = result;
    });
  }

  buyerChange(event: any) {
    const selectedBuyerName = event.srcElement.value;
    this.selectedBuyer = this.buyers.find(b => b.name === selectedBuyerName);
  }

  addBuyerClick(): void {
    this.router.navigate(['/addBuyer']);
  }

  onContinueClick(): void {
    this.router.navigate(['/checkBuyer/', this.selectedBuyer?.id]);
  }
}
