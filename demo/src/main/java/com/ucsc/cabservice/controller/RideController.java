/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Ride;
import com.ucsc.cabservice.service.RideService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jinadi
 */
@RestController
@RequestMapping("/api")
public class RideController {
    @Autowired
    RideService rideService;
  
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/addRide", method = RequestMethod.POST,produces = {"application/json"})
    Ride addRide(@RequestBody Ride ride) {
        System.out.println(ride.getEnd_Location());
        return rideService.addRide(ride);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/updateRide", method = RequestMethod.POST, produces = {"application/json"})
    Ride updateRide(@RequestBody Ride ride) {
        return rideService.updateRide(ride);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/ride", method = RequestMethod.DELETE, produces = {"application/json"})
    String deleteRide(@RequestBody Ride ride) {
        return rideService.deleteRide(ride);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getAllRides", method = RequestMethod.GET, produces = {"application/json"})
    List<Ride> getAllRides() throws Exception{
        System.out.println("All rides");
        return rideService.getAllRides();
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getRide/{id}", method = RequestMethod.GET, produces = {"application/json"})
    Ride getRide(@PathVariable("id") String id) {
       return rideService.getRide(Long.parseLong(id));
    }  
}
