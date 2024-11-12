package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring")
public class FirstController {
	
	@GetMapping("/welcome")
	public String displaySomeResponse2(Model model) {
		
		System.out.println("Model is internally implemented by " + model.getClass().getName());
		model.addAttribute("info", "i am learing spring." );
		
		return "home";
	}
}
