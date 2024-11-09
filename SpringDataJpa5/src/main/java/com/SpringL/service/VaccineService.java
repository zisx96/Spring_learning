package com.SpringL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringL.repo.IVaccine;
import com.SpringL.view.ResultView;

@Service
public class VaccineService implements IVaccineService {
	
	
	private IVaccine repo;
	
	@Autowired
	public void setRepo(IVaccine repo) {
		this.repo = repo;
	}

	@Override
	public List<ResultView> fetchByCost(double cost) {
		
		return repo.findByCostLessThan(cost);
	}

		
	
}
