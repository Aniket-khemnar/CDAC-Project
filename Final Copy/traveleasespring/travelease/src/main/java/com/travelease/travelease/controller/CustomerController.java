package com.travelease.travelease.controller;

import com.travelease.travelease.entity.Customer;
import com.travelease.travelease.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

	@Autowired
    private CustomerService customerService;
	
	@PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomer() {
        return customerService.fetchAllCustomers();
    }
    
}
