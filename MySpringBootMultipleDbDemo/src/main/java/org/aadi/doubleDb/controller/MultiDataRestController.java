package org.aadi.doubleDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.aadi.doubleDb.model.customer.Customer;
import org.aadi.doubleDb.model.product.Product;
import org.aadi.doubleDb.repo.customer.CustomerRepository;
import org.aadi.doubleDb.repo.product.ProductRepository;

@RestController
public class MultiDataRestController {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer(){
		return customerRepo.findAll();
	}
}
