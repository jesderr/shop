package com.jesderr.shop.models;


import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BankCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private int digitCard;

    @NotNull
    private int cvv;

    @NotNull
    private Date actionTime;

    @NotNull
    private String cardHolder;

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
