package com.antlosman.onlinestore.dao;

import com.antlosman.onlinestore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
