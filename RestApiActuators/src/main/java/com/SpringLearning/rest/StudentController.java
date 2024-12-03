package com.SpringLearning.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.model.Student;

@RestController
public class StudentController {
	
	@GetMapping("/info1")
	public ResponseEntity<Student> getStudentInfo(){
		
		Student st = new Student(1, "Rohan", "Delhi");
		
		return new ResponseEntity<Student>(st, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String AddStudent(@RequestBody Student student){
		
		System.out.println(student);
		
		return "data Saved";
	}
	
}
