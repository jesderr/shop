export class BankCard {
  id: number | undefined;
  digitCard: number | undefined;
  cvv: number | undefined;
  actionTime: string | undefined;
  cardHolder: string | undefined;


  constructor(digitCard: number, cvv: number, actionTime: string, cardHolder: string) {
    this.digitCard = digitCard;
    this.cvv = cvv;
    this.actionTime = actionTime;
    this.cardHolder = cardHolder;
  }
}
