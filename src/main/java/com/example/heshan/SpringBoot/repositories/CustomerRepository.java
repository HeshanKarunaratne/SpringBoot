package com.example.heshan.SpringBoot.repositories;

import com.example.heshan.SpringBoot.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
