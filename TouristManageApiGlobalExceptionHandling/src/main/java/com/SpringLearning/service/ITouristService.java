package com.SpringLearning.service;

import java.util.List;

import com.SpringLearning.exceptions.TouristNotFoundException;
import com.SpringLearning.model.Tourist;

public interface ITouristService {

	
	String registerTourist(Tourist tourist);
	Tourist fetchTourist(Integer id) throws TouristNotFoundException;
	List<Tourist> fetchAllTouristInfo();
	public String updateTheTourist(Tourist tourist);
	public String updateTheTouristBudget(Integer id , Double budget);
	public String deleteTouristInfo(Integer id);
	
}
