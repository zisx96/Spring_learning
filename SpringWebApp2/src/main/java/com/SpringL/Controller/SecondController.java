package com.SpringL.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring2")
public class SecondController {
	
	@GetMapping("/welcome")
	public String displaySomeResponse2(Model model) {
		
		System.out.println("Model is internally implemented by " + model.getClass().getName());
		model.addAttribute("info", "i am revising java now." );
		
		return "home";
	}
	
	@GetMapping("/skill")
	public String displaySomeImportantMsg(Model model) {
		
		System.out.println("Model is internally implemented by " + model.getClass().getName());
		model.addAttribute("focus", "focus is the most important skill." );
		
		return "focus";
	}
	
	@GetMapping("/information")
	public String displaySomeImportantInfo(Map<String, Object> map) {
		
		map.put("infos", "Spring with Web");
		return "info";
	}
	
	// void method 
	// cannot work with class Request Mapping 
	
//	@GetMapping("/info")	
//	public void displaySomeImportantInfo2(Map<String, Object> map) {
//		
//		map.put("infos", "Spring with Web and me");
//		return ;
//	}
	
	
	
}
