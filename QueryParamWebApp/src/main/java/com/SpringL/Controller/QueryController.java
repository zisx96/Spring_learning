package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryController {
	
	//	http://localhost:8484/QueryParam/getInfo?n=Raman&course=spring
	
	// if the key in the method is not same as the link then we use requestParam 
	
	@GetMapping("/getInfo")
	public String getSomeInfo(@RequestParam("n")String name, String course, Model model) {
		
		String info = "Hello " + name + " how are you. Is your " + course + " course going well. ";
		
		model.addAttribute("msg", info);
		
		return "home";
	}

}
