package com.alma.crud_fullstack_angular.service.customer;

import com.alma.crud_fullstack_angular.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(int id);
    Customer update(Customer customer);
    void deleteById(int id);
}
