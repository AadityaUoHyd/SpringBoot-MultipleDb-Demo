package org.aadi.doubleDb.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import org.aadi.doubleDb.model.product.Product;

public interface ProductRepository 
extends JpaRepository<Product, Integer> {

}
