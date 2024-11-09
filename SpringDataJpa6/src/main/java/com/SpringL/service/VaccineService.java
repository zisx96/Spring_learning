package com.SpringL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringL.repo.IVaccine;
import com.SpringL.view.ResultView;
import com.SpringL.view.View;

@Service
public class VaccineService implements IVaccineService {
	
	
	private IVaccine repo;
	
	@Autowired
	public void setRepo(IVaccine repo) {
		this.repo = repo;
	}

	@Override
	public <T extends View> List<T> fetchByCostLessThan(double cost, Class<T> cls) {
		
		
		return repo.findByCostLessThan(cost, cls);
	}
		
	
}
