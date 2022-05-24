package com.jesderr.shop.models;

public class Product {
    private Long id;
    private String name;
    private int cost;
    private String date;
    private double weight;

    private Long shopId;
    public Product() {

    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId){
        this.shopId = shopId;
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

    public String getDate() {
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
