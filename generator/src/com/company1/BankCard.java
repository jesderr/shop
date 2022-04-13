package com.company1;

public class BankCard {

    public Long id;
    public String digitCard;
    //public int cvv; this.cvv, cvv = %o,
    public String actionTime;
    public String cardHolder;

    @Override
    public String toString() {
        return String.format("Id = %o, digitCard = %s, actionTime = %s,  cardHolder = %s",
                this.id, this.digitCard, this.actionTime, this.cardHolder);
    }
}
