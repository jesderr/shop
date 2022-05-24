package com.jesderr.shop.models;

import javax.persistence.*;

@Entity
@Table(name = "buyer")
public class Buyer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "surname")
    public String surname;
    @Column(name = "gender")
    public String gender;
    @Column(name = "cardid")
    public Long bankCardId;

    public Buyer() {

    }

}
