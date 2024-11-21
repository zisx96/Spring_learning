package com.SpringLearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLearning.dao.ITouristRepo;
import com.SpringLearning.exceptions.TouristNotFoundException;
import com.SpringLearning.model.Tourist;

@Service
public class TouristService implements ITouristService {
	
	private ITouristRepo repo;
	
	@Autowired
	public void setITouristRepo(ITouristRepo repo) {
		
		this.repo = repo;
	}
	
	@Override
	public String registerTourist(Tourist tourist) {
		
		 Tourist t = repo.save(tourist);
		 
		 return "Tourist Detail Saved Successfully with Id: " + t.getId();
	}

	@Override
	public Tourist fetchTourist(Integer id) throws TouristNotFoundException {
		
//		Optional<Tourist> optional =  repo.findById(id);
//		
//		if(optional.isPresent())
//			return optional.get();
//		else
//			throw new TouristNotFoundException("Tourist with given id not found");
		
		return repo.findById(id).orElseThrow(() -> new TouristNotFoundException("Tourist with given id not found"));
	
	}

	@Override
	public List<Tourist> fetchAllTouristInfo() {
		
		return repo.findAll();
	}

}
