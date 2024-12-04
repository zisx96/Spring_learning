package com.SpringLearning.config;

import org.springframework.batch.item.ItemProcessor;

import com.SpringLearning.model.Customer;

public class CustomerProcesser implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
		
		// logic to filter/process
		
		return item;
	}

}
