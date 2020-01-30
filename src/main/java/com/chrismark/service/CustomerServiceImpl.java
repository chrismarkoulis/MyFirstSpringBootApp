/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.service;

import com.chrismark.dao.CustomerDao;
import com.chrismark.entities.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author chris
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao cdao;
    
    
    
    
    @Override
    public List<Customer> getCustomers() {
        return cdao.findAll();
        
    }

    @Override
    public Customer getCustomerById(int id) {
        return cdao.findById(id);
        
    }

    @Override
    public Customer createCustomer(Customer c) {
        
        return cdao.create(c);
    }

    @Override
    public void deleteCustomer(int id) {

        cdao.delete(id);
    }
    
}
