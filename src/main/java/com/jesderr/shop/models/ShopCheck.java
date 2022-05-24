package com.jesderr.shop.models;

public class ShopCheck {
    private Long id;
    private String operationType;
    private String time;
    private String date;
    private Long buyerId;


    public ShopCheck() {}

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId){
        this.buyerId = buyerId;
    }

    public Long getId() {
        return id;
    }

    public String getOperationType() {
        return operationType;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
