package com.SpringLearning.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.SpringLearning.service.JwtTokenService;
import com.SpringLearning.service.MyUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtTokenService jwtService;
	
	@Autowired
	private MyUserDetailsService userService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authHeader = request.getHeader("Authorization");
		
		String token = null;
		String name = null;
		
		if(authHeader != null && authHeader.startsWith("Bearer ")) {
			
			token  = authHeader.substring(7);
			name = jwtService.extractUserName(token);
		}
		
		if(name != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			
			UserDetails userDetails = userService.loadUserByUsername(name);
			
			Boolean status = jwtService.validateToken(token, userDetails);
			
			if(status) {
				
				UsernamePasswordAuthenticationToken authToken= 
						new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
				authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				System.out.println("autho token :"+ authToken);
				SecurityContextHolder.getContext().setAuthentication(authToken);
			}
		}
		
		filterChain.doFilter(request, response);
		
	}
	
}
