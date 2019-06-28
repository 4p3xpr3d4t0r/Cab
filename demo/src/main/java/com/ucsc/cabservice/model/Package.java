/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name = "package")
public class Package implements Serializable {

    private long package_id;
    private String package_name;
    private String description;
    private double costFor1km;

    public Package() {
    }

    /**
     * @return the package_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getPackage_id() {
        return package_id;
    }

    /**
     * @param package_id the package_id to set
     */
    public void setPackage_id(long package_id) {
        this.package_id = package_id;
    }

    /**
     * @return the package_name
     */
    public String getPackage_name() {
        return package_name;
    }

    /**
     * @param package_name the package_name to set
     */
    public void setPackage_name(String package_name) {
        this.package_name = package_name;
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
     * @return the costFor1km
     */
    public double getCostFor1km() {
        return costFor1km;
    }

    /**
     * @param costFor1km the costFor1km to set
     */
    public void setCostFor1km(double costFor1km) {
        this.costFor1km = costFor1km;
    }

}
