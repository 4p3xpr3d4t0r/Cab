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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jinadi
 */
@Entity
@Table(name = "ride")

public class Ride implements Serializable {

    private long ride_id;
    private String date;
    private String state;
    private String start_Location;
    private String end_Location;
    private long cust_id;
    private long driver_id;
    private java.util.List<Vehicle> vehicle;
    private java.util.List<Customer> customers;

    public Ride() {
    }

    public Ride(long ride_id,String date,String end_Location,String start_Location,String state,long cust_id,long driver_id){
        this.ride_id = ride_id;
        this.date = date;
        this.end_Location = end_Location;
        this.start_Location = start_Location;
        this.state = state;
        this.cust_id = cust_id;
        this.driver_id = driver_id;
    }
  

    /**
     * @return the ride_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getRide_id() {
        return ride_id;
    }

    /**
     * @param ride_id the ride_id to set
     */
    public void setRide_id(long ride_id) {
        this.ride_id = ride_id;
    }

    /**
     * @return the payment
     */
   
    /**
     * @param payment the payment to set
     */
   
     
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
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the vehicle
     */
    @OneToMany
    public java.util.List<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(java.util.List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the customers
     */
    @OneToMany
    public java.util.List<Customer> getCustomers() {
        return customers;
    }

    /**
     * @param customers the customers to set
     */
    public void setCustomers(java.util.List<Customer> customers) {
        this.customers = customers;
    }

    /**
     * @return the startLocation
     */
    public String getStart_Location() {
        return start_Location;
    }

    /**
     * @param startLocation the startLocation to set
     */
    public void setStart_Location(String startLocation) {
        this.start_Location = startLocation;
    }

    /**
     * @return the endLocation
     */
    public String getEnd_Location() {
        return end_Location;
    }

    /**
     * @param endLocation the endLocation to set
     */
    public void setEnd_Location(String endLocation) {
        this.end_Location = endLocation;
    }
    
    public void setCust_id(long cust_id){
        this.cust_id = cust_id;
    }
    
    public long getCust_id(){
        return this.cust_id;
    }
    
    public void setDriver_id(long driver_id){
        this.driver_id = driver_id;
    }
    
    public long getDriver_id(){
        return this.driver_id;
    }

}
