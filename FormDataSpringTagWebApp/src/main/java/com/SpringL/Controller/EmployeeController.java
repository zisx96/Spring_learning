package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringL.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String showHomePage(@ModelAttribute("emp") Employee emp) {
		
		return "register";
	}
	
	@PostMapping("/register")
	public String register(Model model,@ModelAttribute("emp") Employee emp) {
		
		System.out.println(emp);
		
		model.addAttribute("emp", emp);
		
		return "response";
	}

}
