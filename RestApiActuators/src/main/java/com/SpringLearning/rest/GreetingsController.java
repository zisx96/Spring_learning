package com.SpringLearning.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.service.GreetingService;

//	@Controller + @ResponseBody ==> @RestController

@RestController
@RequestMapping("/app1")
public class GreetingsController {
	
	@Autowired
	private GreetingService greet;
	
	@GetMapping("/greet")
	//	@ResponseBody not needed as using rest controller
	public ResponseEntity<String> getWishes(){
		 
		 String res = greet.generateWish("Kamal");
		 
		 return new ResponseEntity<String>(res, HttpStatus.OK);
	 }

}
