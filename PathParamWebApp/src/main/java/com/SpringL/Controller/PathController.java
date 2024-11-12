package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathController {
	
	//	http://localhost:8484/PathParam/getInfo/Suresh/DevOps
	
	@GetMapping("/getInfo/{name}/{cour}")
	public String getSomeInfo(@PathVariable("name")String name, @PathVariable("cour")String course, Model model) {
		
		String info = "Hello " + name + " how are you. Is your " + course + " course going well. ";
		
		model.addAttribute("msg", info);
		
		return "home";
	}

}
