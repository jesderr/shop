package com.jesderr.shop.models;


import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "ProductType")
    private String productType;

    @ManyToOne
    @JoinColumn(name = "id",foreignKey = @ForeignKey(name = "FK_ADDRESS_ID"))
    private Address addressId;

    @OneToMany(mappedBy = "Shop")
    private List<Shop> shopList;

    public Shop(Long id, String name, String productType, Address addressId, List<Shop> shopList) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.addressId = addressId;
        this.shopList = shopList;
    }

    public Shop() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
