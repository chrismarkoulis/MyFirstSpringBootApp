/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chrismark.dao;

import com.chrismark.entities.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author chris
 * 
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    EntityManager entityManager;
    
    private Session getSession(){
        
        Session s = entityManager.unwrap(Session.class);
        return s;
    }
    
    
    
    
    @Override
    public Customer findById(int id) {
        
      Customer c = getSession().byId(Customer.class).load(id);
      return c;
    }

    @Override
    public List<Customer> findAll() {
        Query q = getSession().createQuery("from Customer");
        List<Customer> list = q.getResultList();
        return list;

    }

   

    @Override
    public Customer create(Customer c) {
       
        getSession().save(c);
        return c;
    }

    @Override
    public void delete(int id) {

       Customer c = getSession().find(Customer.class, id);
       getSession().delete(c);
       
    }
    
}
