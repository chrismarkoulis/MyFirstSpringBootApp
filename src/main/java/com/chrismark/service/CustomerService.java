/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.service;

import com.chrismark.entities.Customer;
import java.util.List;

/**
 *
 * @author chris
 */
public interface CustomerService {
    
    public List<Customer> getCustomers();
    public Customer getCustomerById(int id);

    public Customer createCustomer(Customer c);

    public void deleteCustomer(int id);
    
}
