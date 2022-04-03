package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
public class ProductCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productId",foreignKey = @ForeignKey(name = "FK_PRODUCT_ID"))
    private Product productId;

    @ManyToOne
    @JoinColumn(name = "shopCheckId",foreignKey = @ForeignKey(name = "FK_SHOP_CHECK_ID"))
    private ShopCheck shopCheckId;

    public ProductCheck(Long id, Product productId, ShopCheck shopCheckId) {
        this.id = id;
        this.productId = productId;
        this.shopCheckId = shopCheckId;
    }

    public ProductCheck() {

    }
}
