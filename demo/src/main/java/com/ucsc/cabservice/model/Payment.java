/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name="payment")

public class Payment implements Serializable  {

    private long payment_id;
    private double amount;
    private String description;
    private String date;
    private long ride;
    

    /**
     * @return the payment_id
     */
    
    public Payment(long payment_id,double amount,String date,String description,long ride){
        this.payment_id = payment_id;
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.ride = ride;
        
    }
    
    public Payment() {
    }
    
   

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getPayment_id() {
        return payment_id;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(long payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @return the ride
     */
    
    public long getRide() {
        return ride;
    }

    
    public void setRide(long ride) {
        this.ride = ride;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

}
