package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.service.Telusko;

public class LaunchApp1
{

	public static void main(String[] args)
	{
		//BeanFactory
		//ApplicationContext
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");

		Telusko t = container.getBean(Telusko.class);
		
		Boolean status=t.buyTheCourse(2500.0);
		if(status)
			System.out.println("Course Purchased Successfully");
		else
			System.out.println("Failed to buy the course");
	}

}
