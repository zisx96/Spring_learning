package com.SpringLearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringLearning.entity.Users;

@Repository
public interface IUsersRepo extends JpaRepository<Users, Integer> {
	
	Users findByName(String userName);
	
}
