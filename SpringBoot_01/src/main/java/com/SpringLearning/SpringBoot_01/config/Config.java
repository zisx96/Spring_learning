package com.SpringLearning.SpringBoot_01.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	public Config() {
		
		System.out.println("constructor of configuration");
	
	}
	
	@Bean
	public LocalTime createTime() {
		
		return LocalTime.now();
	}
}
