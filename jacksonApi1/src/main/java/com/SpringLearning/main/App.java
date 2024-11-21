package com.SpringLearning.main;

import java.util.ArrayList;
import java.util.List;

import com.SpringLearning.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) throws JsonProcessingException {
		
		Employee emp1 = new Employee(1,"Rohit", "Mumbai");
		Employee emp2 = new Employee(2,"Rohan", "Pune");
		Employee emp3 = new Employee(3,"Raman", "Chennai");
		
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		list.forEach((l) -> System.out.println(l));
		
		// Create ObjectMapper
		
		ObjectMapper mapper = new ObjectMapper();
//		String json = mapper.writeValueAsString(emp);
//		System.out.println(json);
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		
		System.out.println(json);
	}

}
