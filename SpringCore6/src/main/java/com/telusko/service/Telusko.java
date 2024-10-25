package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Telusko 
{
	@Autowired
	@Qualifier("java")
	private ICourse course;

	@Autowired
	public Telusko(@Qualifier("springBoot")ICourse course) 
	{
		super();
		System.out.println("Constructor Injection");
		this.course = course;
	}
	
	public Telusko() 
	{
		super();
		System.out.println("Telusko Bean created");
	}

	@Autowired
//	@Qualifier("springBoot")
	public void setCourse(ICourse course) 
	{
		System.out.println("Setter Injection");
		this.course = course;
	}
	public Boolean buyTheCourse(Double amount)
	{
		return course.getTheCourse(amount);
	}
	
}
