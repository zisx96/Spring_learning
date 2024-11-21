package com.SpringLearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringLearning.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {
	
	
}
