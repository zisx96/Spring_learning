package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET )
	public ModelAndView displaySomeResponse() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello ! Welcome to our First Web App");
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome2")
	public ModelAndView displaySomeResponse2() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello ! Learning Spring here.");
		
		mav.setViewName("index");
		
		return mav;
	}
	
}
