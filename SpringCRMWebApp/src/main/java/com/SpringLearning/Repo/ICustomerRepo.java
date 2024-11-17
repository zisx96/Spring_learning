package com.SpringLearning.Repo;

import org.springframework.data.repository.CrudRepository;

import com.SpringLearning.Model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

	
	
}
