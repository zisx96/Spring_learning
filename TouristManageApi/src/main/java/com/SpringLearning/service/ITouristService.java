package com.SpringLearning.service;

import java.util.List;

import com.SpringLearning.exceptions.TouristNotFoundException;
import com.SpringLearning.model.Tourist;

public interface ITouristService {

	
	String registerTourist(Tourist tourist);
	Tourist fetchTourist(Integer id) throws TouristNotFoundException;
	List<Tourist> fetchAllTouristInfo();
	
}
