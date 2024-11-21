package com.SpringLearning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLearning.model.Customer;
import com.SpringLearning.repo.ICustomerRepo;

@Service
public class CustomerService implements ICustomerService {
	
	private ICustomerRepo repo;
	
	@Autowired
	public void setICustomerRepo(ICustomerRepo repo) {
		
		this.repo = repo;
	}
	
	@Override
	public Iterable<Customer> getCustomerInformation() {
		
		return repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
		
		repo.save(customer);
		
	}

	@Override
	public Customer fetchCustomerById(Integer id) {
		
		Optional<Customer> optional = repo.findById(id);
		
		return optional.get();
	}

	@Override
	public void deletCustomerById(Integer id) {
		
		repo.deleteById(id);
		
	}
	
	
}
