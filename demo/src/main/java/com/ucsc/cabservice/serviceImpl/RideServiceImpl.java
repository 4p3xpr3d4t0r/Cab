/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Ride;
import com.ucsc.cabservice.repository.RideRepository;
import com.ucsc.cabservice.service.RideService;
import java.util.List;
import java.util.concurrent.Semaphore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 4p3x_pr3d4t0r
 */
@Service
@Transactional
public class RideServiceImpl implements RideService{
    
    Semaphore semaphore = new Semaphore(1, true);
    
    @Autowired
    private RideRepository rideRepository;

    static long x = 1;
    
    @Override
    public Ride addRide(Ride ride) {
        ride.setRide_id(x);
        x++;

        return rideRepository.save(ride);
    }

    @Override
    public Ride updateRide(Ride ride) {
        /*Mutex lock to prevent two drivers*/
        try {
            semaphore.acquire(1);
            // do stuff

        } 
        catch (Exception e) {
            System.out.println("Another Driver Took the Ride");
        }
        finally{
            semaphore.release(1);
        }
        
        return rideRepository.save(ride);
    }

    @Override
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    @Override
    public Ride getRide(Long id) {
        return rideRepository.findOne(id);
    }

    @Override
    public String deleteRide(Ride ride) {
        rideRepository.delete(ride);
        return "true";
    }
    
}

    

