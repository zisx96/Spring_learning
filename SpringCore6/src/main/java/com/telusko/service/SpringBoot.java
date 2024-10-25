package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpringBoot implements ICourse
{
	
	public SpringBoot()
	{
		System.out.println("SpringBoot Bean created");
	}

	@Override
	public Boolean getTheCourse(Double amount)
	{
		System.out.println("SpringBoot Course is purchased and amount paid is "+ amount);
		return true;
	}

}
