package com.SpringLearning.service;

import com.SpringLearning.model.Customer;

public interface ICustomerService {
	
	public Iterable<Customer> getCustomerInformation();
	public void registerCustomer(Customer customer);
	public Customer fetchCustomerById(Integer id);
	public void deletCustomerById(Integer id);
	
}
