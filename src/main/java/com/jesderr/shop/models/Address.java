package com.jesderr.shop.models;


import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private float houseNumber;

    @NotNull
    private String street;

    @NotNull
    private String city;

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
