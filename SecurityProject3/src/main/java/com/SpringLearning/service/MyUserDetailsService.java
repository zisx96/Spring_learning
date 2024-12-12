package com.SpringLearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SpringLearning.entity.Users;
import com.SpringLearning.repo.IUsersRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private IUsersRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = repo.findByName(username);
		
		if(users == null) {
			
			throw new UsernameNotFoundException("user not found 404");
		}
		
		return new UserPrincipal(users);
	}	
}
