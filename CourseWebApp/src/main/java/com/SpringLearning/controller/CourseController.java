package com.SpringLearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SpringLearning.model.Course;

@Controller
public class CourseController {
	
	@GetMapping("/courseinfo")
	public String getCourseInfo(Model model) {
		
		model.addAttribute("cid", "T01");
		model.addAttribute("cname", "DevOps");
		model.addAttribute("price", "999 INR");
		
		return "course";
		
	}
	
	@GetMapping("/coursedetail")
	public String getCourseDetails(Model model) {
		
		Course course = new Course();
		course.setCid(1);
		course.setCname("DevOps with AWS");
		course.setPrice(6999.99); 
		
		model.addAttribute("course", course);
		
		return "courseDetail";
		
	}
	
		
	
}
