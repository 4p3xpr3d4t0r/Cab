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
@Table(name = "vehicle")

public class Vehicle implements Serializable {

    private long vehicle_id;
    private String vehicle_num;
    private String name;
    private String type;
    private int num_ofseats;
    private String description;
    private long package_id;
    private List<Package> packages;
    private List<Owner> owners;

    /**
     * @return the vehicle_id
     */
    public Vehicle() {
    }
    
    public Vehicle(long vehicle_id,String description,String name,int num_ofseats,String type,String vehicle_num,long package_id ){
        this.vehicle_id = vehicle_id;
        this.description = description;
        this.name = name;
        this.num_ofseats = num_ofseats;
        this.type = type;
        this.vehicle_num = vehicle_num;
        this.package_id = package_id;
                 
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getVehicle_id() {
        return vehicle_id;
    }

    /**
     * @param vehicle_id the vehicle_id to set
     */
    public void setVehicle_id(long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    /**
     * @return the vehicle_num
     */
    public String getVehicle_num() {
        return vehicle_num;
    }

    /**
     * @param vehicle_num the vehicle_num to set
     */
    public void setVehicle_num(String vehicle_num) {
        this.vehicle_num = vehicle_num;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the numOfseats
     */
    public int getNumOfseats() {
        return num_ofseats;
    }

    /**
     * @param numOfseats the numOfseats to set
     */
    public void setNumOfseats(int num_ofseats) {
        this.num_ofseats = num_ofseats;
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
    
    public void setPackage_id(long package_id){
        this.package_id = package_id;
    }
    
    public long getPackage_id(){
        return this.package_id;
    }

    /**
     * @return the packages
     */
    @OneToMany(cascade = CascadeType.ALL)
    public List<Package> getPackages() {
        return packages;
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    /**
     * @return the owners
     */
    @OneToMany(cascade = CascadeType.ALL)
    
    public List<Owner> getOwners() {
        return owners;
    }

    /**
     * @param owners the owners to set
     */
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    /**
     * @return the rides
     */
}
