package com.company1;

public class Address {

    public Long id;
    public int houseNumber;
    public String street;
    public String city;

    @Override
    public String toString(){
        return String.format("Id = %o, houseNumber = %o, street = %s, city = %s", this.id, this.houseNumber, this.street, this.city);
    }
}