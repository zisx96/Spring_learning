package com.SpringLearning.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.exceptions.TouristNotFoundException;
import com.SpringLearning.model.Tourist;
import com.SpringLearning.service.ITouristService;

@RestController
public class TouristRestApi {
	
	@Autowired
	private ITouristService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist) {
		
		String res = service.registerTourist(tourist);
		
		return new ResponseEntity<String>(res, HttpStatus.CREATED);
	}
	
	@GetMapping("/getTourist/{id}")
	public ResponseEntity<?> getTourist(@PathVariable("id") Integer id) {
		
		Tourist tourist;
		try {
			tourist = service.fetchTourist(id);
			
			return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
			
		} catch (TouristNotFoundException e) {	// not recommended to handle exception in service or rest layers, use aop's 
			
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}	
	}
	
	@GetMapping("/getallTourist")
	public ResponseEntity<?> getAllTourist() {
		
		try {
			List<Tourist> tourists = service.fetchAllTouristInfo();
			
			return new ResponseEntity<List>(tourists, HttpStatus.OK);
			
		} catch (Exception e) {	// not recommended to handle exception in service or rest layers, use aop's 
			
			return new ResponseEntity<String>("some problem occured", HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	@PutMapping("/updateTourist")
	public ResponseEntity<?> updateTheTouristInfo(@RequestBody Tourist tourist) {
		
		try {
			
			String status = service.updateTheTourist(tourist);
			
			return new ResponseEntity<String>(status, HttpStatus.OK);
			
		} catch (TouristNotFoundException e) {	// not recommended to handle exception in service or rest layers, use aop's 
			
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}	
	}
	
	@PatchMapping("/updateTourist/{id}/{budget}")
	public ResponseEntity<String> updateTheTouristBudget(@PathVariable("id") Integer id, @PathVariable("budget") Double budget) {
		
		try {
			
			String status = service.updateTheTouristBudget(id, budget);
			
			return new ResponseEntity<String>(status, HttpStatus.OK);
			
		} catch (TouristNotFoundException e) {	// not recommended to handle exception in service or rest layers, use aop's 
			
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}	
	}
	
	@DeleteMapping("/deleteTourist/{id}")
	public ResponseEntity<String> deleteTheTourist(@PathVariable("id") Integer id) {
		
		try {
			
			String status = service.deleteTouristInfo(id);
			
			return new ResponseEntity<String>(status, HttpStatus.OK);
		}
		
		catch (TouristNotFoundException e) {	// not recommended to handle exception in service or rest layers, use aop's 
			
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}			
	}
	
}
