package com.SpringLearning.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.model.customer.Customer;
import com.SpringLearning.model.product.Product;
import com.SpringLearning.repo.customer.ICustomerRepo;
import com.SpringLearning.repo.product.IProductRepo;

@RestController
public class MultiDbController {

	@Autowired
	private ICustomerRepo crepo;
	
	@Autowired
	private IProductRepo prepo;
	
	@GetMapping("/getallcx")
	public ResponseEntity<List> getAllCustomer(){
		
		List<Customer> cus = crepo.findAll();
		
		return new ResponseEntity<>(cus, HttpStatus.OK);
	}
	
	@GetMapping("/getallpx")
	public ResponseEntity<List> getAllProduct(){
		
		List<Product> pro = prepo.findAll();
		
		return new ResponseEntity<>(pro, HttpStatus.OK);
	}
	
	
}
