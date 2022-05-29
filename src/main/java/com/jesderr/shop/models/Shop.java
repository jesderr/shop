package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "productType")
    public String productType;
    @Column(name = "addressId")
    public Long addressId;

    public Shop(Long id, String name, String productType, Long addressId) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.addressId = addressId;
    }

    public Shop() {

    }
 }
