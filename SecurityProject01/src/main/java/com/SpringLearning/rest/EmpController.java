package com.SpringLearning.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.model.Employee;

@RestController	
public class EmpController {

	List<Employee> list = new ArrayList<>(List.of(new Employee(1,"Rohan", "Delhi")
						, new Employee(2,"Kamal", "Pune"),
						new Employee(3,"Akhil", "Mumbai")));
	
	
	@GetMapping("/get-Emp")
	public List<Employee> getEmployees(){
		
		return list;
	}
	
	@PostMapping("/add")
	public void addEmpoyee(@RequestBody Employee emp) {
		
		list.add(emp);
		System.out.println(list);
		
	}
	
	
	
}
