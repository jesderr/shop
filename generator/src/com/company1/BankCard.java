package com.company1;

public class BankCard {

    public Long id;
    public String digitCard;
    public int cvv;
    public String actionTime;
    public String cardHolder;

    @Override
    public String toString() {
        return String.format("Id = %o, digitCard = %s, cvv =%o,actionTime = %s,  cardHolder = %s",
                this.id, this.digitCard, this.cvv, this.actionTime, this.cardHolder);
    }
}
