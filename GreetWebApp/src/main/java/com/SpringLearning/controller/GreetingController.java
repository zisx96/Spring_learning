package com.SpringLearning.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SpringLearning.service.IGreetings;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {
	
	@Autowired
	private IGreetings greet;
	
	@GetMapping("/greet")
	public String generateWish(Model model) {
		
		String info = greet.generateWish("Ram Charan");
		
		model.addAttribute("wish", info);
		
		return "greeting";
	}
	
	@GetMapping("/wish")	// not a optimal way to give request directly from controller without an view model in between, but we can do it without error
	public void generateWish2(HttpServletResponse response) throws IOException {
		
		String info = greet.generateWish("Karan Kumar");
		
		 PrintWriter writer = response.getWriter();
		 writer.println("<h1> Hello this response is from controller directly "+ info +"</h2>");
		
	}
	
}
