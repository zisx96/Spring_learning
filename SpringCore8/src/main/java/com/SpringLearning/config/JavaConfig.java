package com.SpringLearning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.SpringLearning"})
public class JavaConfig {
	
	public JavaConfig() {
		
		System.out.println("java config bean created");
	}
	
//	@Bean
//	public LocalDateTime createTimeObj() {
//		
//		return LocalDateTime.now();
//	}
//	
}
