package com.alma.crud_fullstack_angular.controller;

import com.alma.crud_fullstack_angular.entity.Customer;
import com.alma.crud_fullstack_angular.service.customer.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> listAll(){
        return customerService.findAll();
    }

    @GetMapping("/{idCustomer}")
    public Customer findById(@PathVariable("idCustomer") Integer id) {
        return customerService.findById(id);
    }

    @PutMapping
    public Customer update(@RequestBody Customer customer) {
        Customer customerToUpdate = customerService.findById(customer.getId());
        customerToUpdate.setFirstName(customer.getFirstName());
        customerToUpdate.setLastName(customer.getLastName());
        customerToUpdate.setEmail(customer.getEmail());
        return customerService.update(customerToUpdate);
    }

    @DeleteMapping("/{idCustomer}")
    public void deleteById(@PathVariable("idCustomer") Integer id) {
        customerService.deleteById(id);
    }
}
