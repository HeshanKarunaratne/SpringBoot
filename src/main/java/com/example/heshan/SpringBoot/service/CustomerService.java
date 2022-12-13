package com.example.heshan.SpringBoot.service;

import com.example.heshan.SpringBoot.dto.Customer;
import com.example.heshan.SpringBoot.dto.NewCustomerRequest;
import com.example.heshan.SpringBoot.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(NewCustomerRequest newCustomerRequest) {
        Customer customer = new Customer();
        customer.setAge(newCustomerRequest.age());
        customer.setName(newCustomerRequest.name());
        customer.setEmail(newCustomerRequest.email());
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    public void updateCustomer(Integer id, NewCustomerRequest newCustomerRequest) {
        Optional<Customer> existingCustomer = customerRepository.findById(id);
        if(existingCustomer.isPresent()){
            Customer customer = existingCustomer.get();
            customer.setAge(newCustomerRequest.age());
            customer.setName(newCustomerRequest.name());
            customer.setEmail(newCustomerRequest.email());
            customerRepository.save(customer);
        }
    }
}
