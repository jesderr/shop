package com.jesderr.shop.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "cost")
    private int cost;

    @NotNull
    @Column(name = "date")
    private Date date;

    @NotNull
    @Column(name = "weight")
    private double weight;

    @ManyToOne
    @JoinColumn(name = "shopId",foreignKey = @ForeignKey(name = "FK_SHOP_ID"))
    private Shop shopId;

    @OneToMany(mappedBy = "Product")
    private List<ProductCheck> productCheckList;

    public Product(Long id, String name, int cost, Date date, double weight, Shop shopId,
                   List<ProductCheck> productCheckList) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.date = date;
        this.weight = weight;
        this.shopId = shopId;
        this.productCheckList = productCheckList;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
