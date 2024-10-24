package com.SpringLearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringLearning.config.JavaConfig;
import com.SpringLearning.sevices.Greeting;

public class App_01 {
	
	
	public static void main(String[] args)
	
	{	
			
		ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);

		Greeting g = container.getBean(Greeting.class);	
		
		System.out.println(g.generatedGreeting("yash"));
	}

}

	

