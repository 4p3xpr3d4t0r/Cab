/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Customer;
import com.ucsc.cabservice.model.Dameges;
import com.ucsc.cabservice.model.Vehicle;
import com.ucsc.cabservice.service.DamageService;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 4p3x_pr3d4t0r
 */

@RestController
@RequestMapping("/api")
public class DamegesController  {
     
    
    @Autowired
    DamageService damageService;
    

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/addDamage", method = RequestMethod.POST,produces = {"application/json"})
    Dameges addDamage(@RequestBody Dameges damage) {
        
        System.out.println("addDamage controller calling"+damage.getVehicle_num());
        return damageService.addDamage(damage);
    }

    
  
    private long damage_id;
    private Set<Vehicle> Vehicle = new HashSet<Vehicle>();

    /**
     * @return the damage_id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getDamage_id() {
        return damage_id;
    }
    
    /**
     * @param damage_id the damage_id to set
     */
    public void setDamage_id(long damage_id) {
        this.damage_id = damage_id;
    }

    /**
     * @return the Vehicle
     */
    @ManyToMany(cascade = CascadeType.ALL)

    public Set<Vehicle> getVehicle() {
        return Vehicle;
    }

    /**
     * @param Vehicle the Vehicle to set
     */
    public void setVehicle(Set<Vehicle> Vehicle) {
        this.Vehicle = Vehicle;
    }

}
