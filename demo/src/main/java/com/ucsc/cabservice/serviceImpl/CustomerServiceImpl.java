/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.cabservice.serviceImpl;

import com.ucsc.cabservice.model.Customer;
import com.ucsc.cabservice.repository.CustomerRepository;
import com.ucsc.cabservice.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 4p3x_pr3d4t0r
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    
    @Autowired
    private CustomerRepository customerRepository;

    static long x = 1;
    
    @Override
    public Customer addCustomer(Customer customer) {
        customer.setCustId(x);
        x = x+1;
        return customerRepository.save(customer);
        
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public String deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
        return "true";
    }

    @Override
    public List<Customer> findCustomerByMobile(String mobile) {
        return customerRepository.findCustomerByMobile(mobile);
    }
    
    @Override
    public List<Customer> findCustomerByMail(String mail) {
        return customerRepository.findCustomerByMail(mail);
    }
    
}