/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Payment;
import com.ucsc.cabservice.repository.PaymentRepository;
import com.ucsc.cabservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Suganb
 */

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    private PaymentRepository paymentRepository;

    static long x = 8;
    
    
    @Override
    public Payment addPayment(Payment payment) {
        payment.setPayment_id(x);
        return paymentRepository.save(payment);
    }
}
