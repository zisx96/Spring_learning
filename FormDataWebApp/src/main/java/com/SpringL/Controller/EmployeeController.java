package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringL.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String showHomePage() {
		
		return "register";
	}
	
	// bad approach
//	public String register(Model model, HttpServletRequest request) {
//		
//		String name = request.getParameter("name");
//		
//		return "response";
//	}
	
	@PostMapping("/register")
	public String register(Model model, Employee emp) {
		
		System.out.println(emp);
		
		model.addAttribute("emp", emp);
		
		return "response";
	}

}
