package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "productcheck")
public class ProductCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "productid")
    public Long productId;
    @Column(name = "shopcheckid")
    public Long shopCheckId;
    public ProductCheck() {}

    public ProductCheck(Long productId, Long shopCheckId) {
        this.productId = productId;
        this.shopCheckId = shopCheckId;
    }

    public ProductCheck(Long id, Long productId, Long shopCheckId) {
        this.id = id;
        this.productId = productId;
        this.shopCheckId = shopCheckId;
    }
}
