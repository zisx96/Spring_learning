package com.SpringL.service;

import java.util.List;

import com.SpringL.view.ResultView;

public interface IVaccineService {
	
	public List<ResultView> fetchByCost(double cost);

}
