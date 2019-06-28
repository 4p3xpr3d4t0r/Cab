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
@Table(name = "rating")

public class Rating implements Serializable {

    private long rate_id;
    private Driver driver;
    private int rate;

    /**
     * @return the rate_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRate_id() {
        return rate_id;
    }

    /**
     * @param rate_id the rate_id to set
     */
    public void setRate_id(long rate_id) {
        this.rate_id = rate_id;
    }

    /**
     * @return the driver
     */
    @OneToOne(cascade = CascadeType.ALL)
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

}
