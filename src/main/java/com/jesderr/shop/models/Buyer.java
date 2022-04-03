package com.jesderr.shop.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @NotNull
    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "bankCardId",foreignKey = @ForeignKey(name = "FK_BANKCARD_ID"))
    private BankCard bankCardId;

    @OneToMany(mappedBy = "ShopCheck")
    private List<ShopCheck> shopCheckList;

    public Buyer(Long id, String name, String surname, String gender, BankCard bankCardId, List<ShopCheck> shopCheckList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.bankCardId = bankCardId;
        this.shopCheckList = shopCheckList;
    }

    public Buyer() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
