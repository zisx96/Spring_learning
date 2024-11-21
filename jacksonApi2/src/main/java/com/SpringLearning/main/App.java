package com.SpringLearning.main;

import java.io.File;
import java.io.IOException;

import com.SpringLearning.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) throws IOException {
	
		// Create ObjectMapper
		
		ObjectMapper mapper = new ObjectMapper();
		
		Employee emp = mapper.readValue(new File("src/main/resources/sample.json"), Employee.class);
		
		System.out.println(emp);
		
	}

}
