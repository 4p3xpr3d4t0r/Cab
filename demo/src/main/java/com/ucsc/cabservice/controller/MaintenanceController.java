/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Maintance;
import com.ucsc.cabservice.service.MaintainceService;
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
public class MaintenanceController {
    
    
    @Autowired
    MaintainceService maintainService;
    

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/addMaintenance", method = RequestMethod.POST,produces = {"application/json"})
    Maintance addMaintenance(@RequestBody Maintance maintance) {
        
        System.out.println("addMaintenance controller calling");
        return maintainService.addMaintance(maintance);
    }
    
}
