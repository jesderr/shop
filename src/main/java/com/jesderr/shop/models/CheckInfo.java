package com.jesderr.shop.models;

public class CheckInfo {
    public Long productId;
    public Long buyerId;

    public CheckInfo() {
    }

    public CheckInfo(Long productId, Long buyerId) {
        this.productId = productId;
        this.buyerId = buyerId;
    }


}
