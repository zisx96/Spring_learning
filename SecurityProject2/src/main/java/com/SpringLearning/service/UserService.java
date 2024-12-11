package com.SpringLearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLearning.entity.Users;
import com.SpringLearning.repo.IUsersRepo;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUsersRepo repo;
	
	@Override
	public Users addUser(Users user) {
		
		return repo.save(user);
	}

	@Override
	public List<Users> getAllUser() {
		
		return repo.findAll();
	}

}
