package main;

import service.ICourse;

public class Telusko 
{
	private ICourse course;

	
	public Telusko(ICourse course) 
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
