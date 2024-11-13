package com.SpringL.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

	@GetMapping("/home")
	public String showHomePage() {
		
		return "home";
	}
	
	@GetMapping("/response")
	public String getBooksInfo(Model model) {
		
		String booksName[] = new String[] {"Java", "Spring Boot", "Servlet"};
		
		for(String book : booksName) {
			
			System.out.println(book);
		}
		
		model.addAttribute("booksName", booksName);
		
		return "response"; 
	}
		
}
