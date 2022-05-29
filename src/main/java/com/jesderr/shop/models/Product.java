package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "cost")
    public int cost;
    @Column(name = "date")
    public String date;
    @Column(name = "weight")

    public double weight;
    @Column(name = "shopId")

    public Long shopId;

    public Product(Long id, String name, int cost, String date, double weight, Long shopId) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.date = date;
        this.weight = weight;
        this.shopId = shopId;
    }

    public Product() {

    }
}
