package com.company1;

public class Product {

    public Long id;
    public String name;
    public int cost;
    public String date;
    public int weight;
    public int shopId;

    @Override
    public String toString(){
        return String.format("Id = %o, name = %s, cost = %o, date = %s, weight = %o, shopId = %o", this.id, this.name,
                this.cost, this.date, this.weight, this.shopId);
    }
}