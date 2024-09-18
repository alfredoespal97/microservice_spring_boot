package com.alma.crud_fullstack_angular.service;

import com.alma.crud_fullstack_angular.entity.Customer;
import com.alma.crud_fullstack_angular.exception.ResourceNotFoundException;
import com.alma.crud_fullstack_angular.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Customer with id " + id + " not found")
        );
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }
}
