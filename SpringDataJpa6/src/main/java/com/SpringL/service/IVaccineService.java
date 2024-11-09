package com.SpringL.service;

import java.util.List;

import com.SpringL.view.ResultView;
import com.SpringL.view.View;

public interface IVaccineService {
	
	public<T extends View>List<T> fetchByCostLessThan(double cost, Class<T> cls);

}
