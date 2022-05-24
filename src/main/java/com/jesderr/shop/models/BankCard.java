package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "bankcard")
public class BankCard {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "digitcard")
    public Long digitCard;
    @Column(name = "cvv")
    public int cvv;
    @Column(name = "actiontime")
    public String actionTime;
    @Column(name = "cardholder")
    public String cardHolder;

    public BankCard() {

    }

    public BankCard(Long id, Long digitCard, int cvv, String actionTime, String cardHolder) {
        this.id = id;
        this.digitCard = digitCard;
        this.cvv = cvv;
        this.actionTime = actionTime;
        this.cardHolder = cardHolder;
    }

}
