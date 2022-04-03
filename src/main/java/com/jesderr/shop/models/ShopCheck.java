package com.jesderr.shop.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.sql.Time;

@Entity
public class ShopCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //private Long buyerId;

    @NotNull
    private String operationType;

    @NotNull
    private Time time;

    @NotNull
    private Date date;

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
