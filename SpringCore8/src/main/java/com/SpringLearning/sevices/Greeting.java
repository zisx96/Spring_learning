package com.SpringLearning.sevices;


import org.springframework.stereotype.Service;

@Service
public class Greeting {
	
//	@Autowired
//	private Integer hour;
	
	public Greeting() {
		
		System.out.println("Greetings bean created");
	}
	
	public String generatedGreeting(String name) {
		
		int hour = 14;
		
		if(hour < 12)
			return "good morinig " + name;
		else if(hour < 16)
			return "good evening " + name;
		else if(hour < 20)
			return "good night " + name;
		
		return "bye";			
	}
	
}
