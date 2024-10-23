package com.telusko.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	public Config()
	{
		System.out.println("Config  bean created");
	}
	
	@Bean
	public Password createPasswordBean()
	{
		Password pass=new Password("SHA");
		return pass;
	}

}
