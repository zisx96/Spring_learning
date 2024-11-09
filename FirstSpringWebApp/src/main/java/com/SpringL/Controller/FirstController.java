package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/welcome")
	public ModelAndView displaySomeResponse() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello ! Welcome to our First Web App");
		
		mav.setViewName("index");
		
		return mav;
	}
	
}
