package com.SpringLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringLearning.service.ICourse;

@SpringBootApplication
public class RestApiProfilesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(RestApiProfilesApplication.class, args);
	
		ICourse course = container.getBean(ICourse.class);
		
		course.getTheCourse(5000.00);
	
	}

}
