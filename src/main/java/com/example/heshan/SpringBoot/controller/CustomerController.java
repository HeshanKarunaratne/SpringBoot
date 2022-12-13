package com.example.heshan.SpringBoot.controller;

import com.example.heshan.SpringBoot.dto.Customer;
import com.example.heshan.SpringBoot.dto.NewCustomerRequest;
import com.example.heshan.SpringBoot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    public void addCustomers(@RequestBody NewCustomerRequest newCustomerRequest) {
        customerService.addCustomer(newCustomerRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Integer id) {
        customerService.deleteCustomer(id);
    }

    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable("id") Integer id,
                               @RequestBody NewCustomerRequest newCustomerRequest) {
        customerService.updateCustomer(id, newCustomerRequest);
    }
}
