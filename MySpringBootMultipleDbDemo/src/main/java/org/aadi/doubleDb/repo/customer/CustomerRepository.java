package org.aadi.doubleDb.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import org.aadi.doubleDb.model.customer.Customer;

public interface CustomerRepository 
extends JpaRepository<Customer, Integer> {

}
