package com.SpringLearning.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringLearning.model.customer.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

	
}
