package com.SpringLearning.repo;

import org.springframework.data.repository.CrudRepository;

import com.SpringLearning.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

	
	
}
