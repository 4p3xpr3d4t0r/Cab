/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.controller;

import com.ucsc.cabservice.model.Payment;
import com.ucsc.cabservice.service.PaymentService;
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
public class PaymentController {
    
    @Autowired
    PaymentService paymentService;
    

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/addPayment", method = RequestMethod.POST,produces = {"application/json"})
    Payment addPayment(@RequestBody Payment payment) {
        
        System.out.println("addPayment controller calling"+payment);
        return paymentService.addPayment(payment);
    }
    
}
