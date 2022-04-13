package com.company1;

public class Shop {
    public Long id;
    public String name;
    public String productType;
    public int addressId;

    @Override
    public String toString(){
        return String.format("Id = %o, name = %s, productType = %s, addressId = %o", this.id, this.name, this.productType, this.addressId);
    }
}
