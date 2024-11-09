package com.telusko.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.entity.Vaccine;
import com.telusko.repo.IVaccineRepo;

@Service
public class VaccineService implements IVaccineService 
{
	private IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo)
	{	
		this.repo = repo;
	}

	@Override
	public List<Vaccine> fetchByCost(Double cost)
	{
		
		return repo.findByCost(cost);
	}

	@Override
	public List<Vaccine> fetchByCostLessThanEqual(Double cost)
	{
		
		return repo.findByCostLessThanEqual(cost);
	}

	@Override
	public List<Vaccine> fetchByCostBetween(Double startCost, Double endingCost) {
		
		return repo.findByCostBetween(startCost, endingCost);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompanyEquals(String name) {
		
		return repo.findByVaccineCompanyEquals(name);
	}

	@Override
	public List<Vaccine> fetchdByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost) {
		
		return repo.findByVaccineNameInAndCostBetween(names, minCost, maxCost);
	}


}
