package org.aadi.doubleDb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.aadi.doubleDb.model.customer.Customer;
import org.aadi.doubleDb.model.product.Product;
import org.aadi.doubleDb.repo.customer.CustomerRepository;
import org.aadi.doubleDb.repo.product.ProductRepository;

@SpringBootApplication
public class MySpringBootMultipleDbDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootMultipleDbDemoApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;

	//let use runner for testing purpose.

	@Override
	public void run(String... args) throws Exception {
		productRepo.saveAll(
				Arrays.asList(
						new Product(1201, "Prod-1", "Core Java Book"),
						new Product(1202, "Prod-2", "Spring Book"),
						new Product(1203, "Prod-3", "Hibernate Book")
						)
				);

		customerRepo.saveAll(
				Arrays.asList(
						new Customer(6100, "aaditya@gmail.com", "aaditya"),
						new Customer(6101, "bachchu@yahoo.com", "bachchu"),
						new Customer(6102, "chatterjee@outlook.com", "chatterjee")
						)
				);
	}

}
