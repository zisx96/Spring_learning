package com.SpringLearning.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("java")
public class Java implements ICourse {
	
	public Java() {
		
		System.out.println("java bean created");
	}

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println(" Java course purchased for "+ amount);
		return true;
	}

}
