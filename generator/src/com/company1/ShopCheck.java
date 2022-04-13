package com.company1;

public class ShopCheck {

    public Long id;
    public String operationType;
    public String time;
    public String date;
    public int buyerId;

    @Override
    public String toString() {
        return String.format("Id = %o, operationType = %s, time = %s,  date = %s, buyerId = %o",
                this.id, this.operationType, this.time, this.date, this.buyerId);
    }
}
