package com.jesderr.shop.models;


import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "houseNumber")
    public float houseNumber;
    @Column(name = "street")
    public String street;
    @Column(name = "city")
    public String city;


    public Address(Long id, float houseNumber, String street, String city) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }

    public Address() {

    }
}
