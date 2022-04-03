package com.jesderr.shop.models;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class BankCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "digitCard")
    private int digitCard;

    @NotNull
    @Column(name = "cvv")
    private int cvv;

    @NotNull
    @Column(name = "actionTime")
    private Date actionTime;

    @NotNull
    @Column(name = "cardHolder")
    private String cardHolder;

    @OneToMany(mappedBy = "bankCard")
    private List<Buyer> buyerList;

    public BankCard(Long id, int digitCard, int cvv, Date actionTime, String cardHolder, List<Buyer> buyerList) {
        this.id = id;
        this.digitCard = digitCard;
        this.cvv = cvv;
        this.actionTime = actionTime;
        this.cardHolder = cardHolder;
        this.buyerList = buyerList;
    }

    public BankCard() {

    }

    public Long getId() {
        return id;
    }

    public int getDigitCard() {
        return digitCard;
    }

    public int getCvv() {
        return cvv;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDigitCard(int digitCard) {
        this.digitCard = digitCard;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
}
