package com.SpringLearning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringLearning.entity.Users;

@Service
public interface IUserService {

	public Users addUser(Users user);
	
	public List<Users> getAllUser();
	
}
