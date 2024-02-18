package com.travelease.travelease.service;

import com.travelease.travelease.entity.Customer;
import com.travelease.travelease.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
    private CustomerRepository customerRepository;
	
	@Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        List<Customer> allCustomers = customerRepository.findAll();
        return allCustomers;
    }

    @Override
    public Customer getCustomerById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }
        return null;
    }

    @Override
    public Customer updateCustomerById(Long id, Customer customer) {
        Optional<Customer> customer1 = customerRepository.findById(id);

        if (customer1.isPresent()) {
            Customer originalCustomer = customer1.get();

            if (Objects.nonNull(customer.getCustName()) && !"".equalsIgnoreCase(customer.getCustName())) {
                originalCustomer.setCustName(null);
            }
            
            return customerRepository.save(originalCustomer);
        }
        return null;
    }

    @Override
    public String deleteDepartmentById(Long id) {
        if (customerRepository.findById(id).isPresent()) {
            customerRepository.deleteById(id);
            return "Customer deleted successfully";
        }
        return "No such customer in the database";
    }
}
