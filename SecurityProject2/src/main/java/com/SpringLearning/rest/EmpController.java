package com.SpringLearning.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.entity.Users;
import com.SpringLearning.model.Employee;
import com.SpringLearning.service.IUserService;

import jakarta.servlet.http.HttpServletRequest;

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
	
	@GetMapping("/get-info")
	public String getTheCourseInfo(HttpServletRequest request) {
		
		return "Spring boot course is currently viewed. " + request.getSession().getId();
		
	}
	
	@GetMapping("/csrf")
	public CsrfToken getToken(HttpServletRequest request) {
		
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	
}
