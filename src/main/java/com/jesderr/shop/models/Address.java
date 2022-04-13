package com.jesderr.shop.models;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "House_number")
    private float houseNumber;

    @NotNull
    @Column(name = "Street")
    private String street;

    @NotNull
    @Column(name = "City")
    private String city;

    /*
    public Address(Long id, float houseNumber, String street, String city, List<Shop> shopList) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.shopList = shopList;
    }

    public Address() {

    }

     */

    public long getId(){
        return id;
    }

    public float getHouseNumber(){
        return houseNumber;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setHouseNumber(float houseNumber){
        this.houseNumber = houseNumber;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public void setCity(String city){
        this.city = city;
    }
}
