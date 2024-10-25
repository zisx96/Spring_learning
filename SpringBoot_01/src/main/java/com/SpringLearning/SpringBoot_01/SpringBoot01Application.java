package com.SpringLearning.SpringBoot_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringLearning.SpringBoot_01.service.Greetings;

@SpringBootApplication	// -> @ConponentScan + @EnableAutoConfiguration 
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot01Application.class, args);
		
		Greetings greet = container.getBean(Greetings.class);
		
		String status = greet.greetingWish("Yash");
		
		System.out.println(status);
	}

}
