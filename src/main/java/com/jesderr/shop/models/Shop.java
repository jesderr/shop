package com.jesderr.shop.models;


public class Shop {
    private Long id;
    private String name;
    private String productType;
    private Long addressId;
    public Shop() {

    }
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId){
        this.addressId = addressId;
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
