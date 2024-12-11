package com.SpringLearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFiltersChain(HttpSecurity http) throws Exception {
		
		http.csrf(customizer -> customizer.disable());	//csrf disabled. Cross-Site Request Forgery
//		http.formLogin(Customizer.withDefaults());
		
		http.httpBasic(Customizer.withDefaults());
		http.sessionManagement(session-> session	// made the session stateless
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
		
	}
	
	@Bean
	public UserDetailsService userDetails() {
		
		UserDetails user = User.withDefaultPasswordEncoder()
		.username("aman")
		.password("aman@123")
		.roles("USER")
		.build();
		
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("zisx")
				.password("zisx@123")
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user, admin);
	}
	
}
