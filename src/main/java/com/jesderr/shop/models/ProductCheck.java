package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "productCheck")
public class ProductCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "productId")

    public Long productId;
    @Column(name = "shopCheckId")

    public Long shopCheckId;
    public ProductCheck() {}

    public ProductCheck(Long id, Long productId, Long shopCheckId) {
        this.id = id;
        this.productId = productId;
        this.shopCheckId = shopCheckId;
    }
}
