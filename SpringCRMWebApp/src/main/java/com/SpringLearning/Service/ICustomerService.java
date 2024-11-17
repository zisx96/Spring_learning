package com.SpringLearning.Service;

import com.SpringLearning.Model.Customer;

public interface ICustomerService {
	
	public Iterable<Customer> getCustomerInformation();
	public void registerCustomer(Customer customer);
	public Customer fetchCustomerById(Integer id);
	public void deletCustomerById(Integer id);
	
}
