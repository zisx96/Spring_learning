package com.SpringLearning.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLearning.model.Student;

@Service
public class GreetingService implements IGreetings {
	
	@Override
	public String generateWish(String name) {
		
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		
		if(hour < 12)
			return "Good Morning "+ name; 
		else if(hour < 16)
			return "Good Afternoon " + name; 
		else if(hour < 20)
			return "Good Evening " + name; 
		else
			return "Good Night "+ name;
	}

	@Override
	public Boolean addStudent(Student st) {
		
		System.out.println(st);
		return true;
	}

}
