package com.jesderr.shop.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class ShopCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "operationType")
    private String operationType;

    @NotNull
    @Column(name = "time")
    private Time time;

    @NotNull
    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "buyerId",foreignKey = @ForeignKey(name = "FK_BUYER_ID"))
    private Buyer buyerId;

    @OneToMany(mappedBy = "ShopCheck")
    private List<ProductCheck> productCheckList;

    public ShopCheck(Long id, String operationType, Time time, Date date, Buyer buyerId,
                     List<ProductCheck> productCheckList) {
        this.id = id;
        this.operationType = operationType;
        this.time = time;
        this.date = date;
        this.buyerId = buyerId;
        this.productCheckList = productCheckList;
    }

    public ShopCheck() {

    }

    public Long getId() {
        return id;
    }

    public String getOperationType() {
        return operationType;
    }

    public Time getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
