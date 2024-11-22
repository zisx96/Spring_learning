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
	public ResponseEntity<Tourist> getTourist(@PathVariable("id") Integer id) {
		
		Tourist tourist;
		
		tourist = service.fetchTourist(id);
			
		return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
	
	}
	
	@GetMapping("/getallTourist")
	public ResponseEntity<?> getAllTourist() {
		
		
		List<Tourist> tourists = service.fetchAllTouristInfo();
			
		return new ResponseEntity<List>(tourists, HttpStatus.OK);
			
	}
	
	@PutMapping("/updateTourist")
	public ResponseEntity<String> updateTheTouristInfo(@RequestBody Tourist tourist) {
			
		String status = service.updateTheTourist(tourist);
			
		return new ResponseEntity<String>(status, HttpStatus.OK);
			
			
	}
	
	@PatchMapping("/updateTourist/{id}/{budget}")
	public ResponseEntity<String> updateTheTouristBudget(@PathVariable("id") Integer id, @PathVariable("budget") Double budget) {
			
		String status = service.updateTheTouristBudget(id, budget);
			
		return new ResponseEntity<String>(status, HttpStatus.OK);
			
	}
	
	@DeleteMapping("/deleteTourist/{id}")
	public ResponseEntity<String> deleteTheTourist(@PathVariable("id") Integer id) {
			
		String status = service.deleteTouristInfo(id);
		
		return new ResponseEntity<String>(status, HttpStatus.OK);
			
	}
	
}
