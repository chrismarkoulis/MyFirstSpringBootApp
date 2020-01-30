/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.controller;

import com.chrismark.entities.Customer;
import com.chrismark.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author chris
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    CustomerService service;

    
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") int id) {
        return service.getCustomerById(id);
    }

    @GetMapping("/list")
    public List<Customer> getCustomers() {
       List<Customer> list = service.getCustomers();
        return list;
    }
    
    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer c){
        
     return service.createCustomer(c);   
    }
    
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") int id){
    
        service.deleteCustomer(id);
    
    }
}
