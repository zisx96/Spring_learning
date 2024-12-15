package com.SpringLearning.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringLearning.model.product.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

	
}
