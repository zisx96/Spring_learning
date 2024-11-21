package com.SpringLearning.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringLearning.service.GreetingService;

@Controller
@RequestMapping("/app1")
public class GreetingsController {
	
	@Autowired
	private GreetingService greet;
	
	@GetMapping("/greet")
	@ResponseBody
	public ResponseEntity<String> getWishes(){
		 
		 String res = greet.generateWish("Kamal");
		 
		 return new ResponseEntity<String>(res, HttpStatus.OK);
	 }

}
