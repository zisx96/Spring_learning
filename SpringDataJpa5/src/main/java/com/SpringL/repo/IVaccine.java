package com.SpringL.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringL.entity.Vaccine;
import com.SpringL.view.ResultView;

public interface IVaccine extends JpaRepository<Vaccine, Integer> {
	
	//findBy-propertyName-Keywords
	
	List<ResultView> findByCostLessThan(double cost);
}
