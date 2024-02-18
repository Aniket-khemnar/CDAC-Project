package com.travelease.travelease.service;


import com.travelease.travelease.entity.Customer;
import java.util.List;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
    
	List<Customer> fetchAllCustomers();
	
	Customer getCustomerById(Long id);
	
    Customer updateCustomerById(Long id, Customer customer);

    String deleteDepartmentById(Long id);
	
}
