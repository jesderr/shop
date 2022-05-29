package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "shopcheck")
public class ShopCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    public Long id;
    @Column(name = "operationtype")

    public String operationType;
    @Column(name = "time")
    public String time;
    @Column(name = "date")
    public String date;
    @Column(name = "buyerid")
    public Long buyerId;

    public ShopCheck(String operationType, String time, String date, Long buyerId) {
        this.operationType = operationType;
        this.time = time;
        this.date = date;
        this.buyerId = buyerId;
    }

    public ShopCheck(Long id, String operationType, String time, String date, Long buyerId) {
        this.id = id;
        this.operationType = operationType;
        this.time = time;
        this.date = date;
        this.buyerId = buyerId;
    }

    public ShopCheck() {}
}
