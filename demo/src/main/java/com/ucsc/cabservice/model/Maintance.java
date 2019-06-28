/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name="maintaince")

public class Maintance implements Serializable  {
    private long maintain_id;
    private String date;
    private String description;
    private String vehicle_num;
    private List<Vehicle> vehicle;
    
    
    
    public Maintance(){
        
    }
    
    public Maintance(long maintain_id,String date,String description,String vehicle_num){
        this.date = date;
        this.maintain_id = maintain_id;
        this.description = description;
        this.vehicle_num = vehicle_num;
    }

    /**
     * @return the maintain_id
     */
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getMaintain_id() {
        return maintain_id;
    }

    /**
     * @param maintain_id the maintain_id to set
     */
    public void setMaintain_id(long maintain_id) {
        this.maintain_id = maintain_id;
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
     * @return the nextDate
     */
   

    /**
     * @return the vehicle
     */
    @OneToMany(cascade = CascadeType.ALL)
    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
    
     public String getVehicle_num() {
        return vehicle_num;
    }

    /**
     * @param cost the cost to set
     */
    public void setVehicle_num(String vehicle_num) {
        this.vehicle_num = vehicle_num;
    }

    /**
     * @return the vehicle
     */
    
}
