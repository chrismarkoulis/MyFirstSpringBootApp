/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.dao;

import com.chrismark.entities.Customer;
import java.util.List;

/**
 *
 * @author chris
 */
public interface CustomerDao {

    public Customer findById(int id);

    public List<Customer> findAll();

    public Customer create(Customer c);

    public void delete(int id);
    
}
