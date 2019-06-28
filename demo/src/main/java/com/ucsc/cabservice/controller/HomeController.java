 package com.ucsc.cabservice.controller;


import com.ucsc.cabservice.model.Customer;
import com.ucsc.cabservice.service.CustomerService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
@RestController
@RequestMapping("/api")

public class HomeController {
    
    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST,produces = {"application/json"})
    Customer addCustomer(@RequestBody Customer customer) {
        
        System.out.println("controller calling");
        return customerService.addCustomer(customer);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST, produces = {"application/json"})
    Customer updateCustomer(@RequestBody Customer customer) {
        System.out.println("updateCustomer Controller running");
        return customerService.updateCustomer(customer);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE, produces = {"application/json"})
    String deleteCustomer(@RequestBody Customer customer) {
        return customerService.deleteCustomer(customer);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET, produces = {"application/json"})
    List<Customer> getAllCustomers() throws Exception{
        return customerService.getAllCustomers();
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, produces = {"application/json"})
    Customer getCustomer(@PathVariable("id") String id) {
       return customerService.getCustomer(Long.parseLong(id));
    }
    
    
    
    

    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/customer/mobile", method = RequestMethod.POST, produces = {"application/json"})
    List<Customer> getAllCustomersByMobile(HttpServletRequest req) throws Exception{
        System.out.println("controller callingggggggggggggg......");
        String mobile =req.getParameter("mobile").toString();
        System.out.println(mobile);
        return customerService.findCustomerByMobile(mobile);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getCustomerByMail", method = RequestMethod.POST, produces = {"application/json"})
    List<Customer> getCustomersByMail(HttpServletRequest req) throws Exception{
        String mail = req.getParameter("mail");
        System.out.println(mail);
        return customerService.findCustomerByMail(mail);
    }
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getCustomerByMail2", method = RequestMethod.POST, produces = {"application/json"})
    List<Customer> getCustomersByMail2(@RequestBody LoginObject lgobj) throws Exception{
        String mail = lgobj.getMail();
        System.out.println(mail);
        return customerService.findCustomerByMail(mail);
    }  
    
    
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/getCustomerById/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public Customer getCustomerById(@PathVariable("id") Long id) throws Exception {
        return customerService.getCustomer(id);
    }
}

class LoginObject {
    String mail;
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
}