package com.SpringLearning.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.model.Student;
import com.SpringLearning.service.IGreetings;


@RestController
public class GreetingsController {
	
	@Autowired
	private IGreetings greet;
	
	@GetMapping("/greet")
	public ResponseEntity<String> getWishes(){
		 
		 String res = greet.generateWish("Kamal");
		 
		 return new ResponseEntity<String>(res, HttpStatus.OK);
	 }
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		
		System.out.println(student);
		
		Boolean res = greet.addStudent(student);
		if(res) {
			
			String msg = "Student data added.";
			return new ResponseEntity<String>(msg, HttpStatus.OK);				
		}
		else {
			
			String msg = "Student data cannot be added";
			return new ResponseEntity<String>(msg, HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		
	}

}
