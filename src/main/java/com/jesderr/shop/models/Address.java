package com.jesderr.shop.models;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "houseNumber")
    private float houseNumber;

    @NotNull
    @Column(name = "street")
    private String street;

    @NotNull
    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "Address")
    private List<Shop> shopList;

    public Address(Long id, float houseNumber, String street, String city, List<Shop> shopList) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.shopList = shopList;
    }

    public Address() {

    }

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
