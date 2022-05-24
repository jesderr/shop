package com.jesderr.shop.models;

public class ProductCheck {
    private Long id;
    private Long productId;
    private Long shopCheckId;
    public ProductCheck() {}

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId){
        this.productId = productId;
    }

    public Long getShopCheckId() {
        return shopCheckId;
    }

    public void setShopCheckId(Long shopCheckId){
        this.shopCheckId = shopCheckId;
    }
}
