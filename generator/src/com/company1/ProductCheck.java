package com.company1;

public class ProductCheck {

    public Long id;
    public int productId;
    public int shopCheckId;

    @Override
    public String toString() {
        return String.format("Id = %o, productId = %s, shopCheckId = %s", this.id, this.productId, this.shopCheckId);
    }
}