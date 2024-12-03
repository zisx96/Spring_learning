package com.SpringLearning.service;

import com.SpringLearning.model.Student;

public interface IGreetings {
	
	String generateWish(String name);
	Boolean addStudent(Student st);
	
}
