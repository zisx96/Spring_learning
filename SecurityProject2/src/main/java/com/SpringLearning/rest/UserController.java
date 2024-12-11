package com.SpringLearning.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.entity.Users;
import com.SpringLearning.service.IUserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {

	@Autowired
	private IUserService service;
	
	BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder(12);
	
	@GetMapping("/get-users")
	public List<Users> getUsers(){
		
		return service.getAllUser();
		
	}
	
	@PostMapping("/add-user")
	public Users addTheUser(@RequestBody Users user){
		
		String str = bCrypt.encode(user.getPassword());
		user.setPassword(str);
		
		return service.addUser(user);
	}
	
	@GetMapping("/get-courseinfo")
	public String getTheCourseInfo(HttpServletRequest request) {
		
		return "Spring boot. " + request.getSession().getId();
		
	}
}
