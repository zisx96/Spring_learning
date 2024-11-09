package com.SpringL.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringL.entity.Vaccine;
import com.SpringL.view.View;

public interface IVaccine extends JpaRepository<Vaccine, Integer> {
	
	//findBy-propertyName-Keywords
	
	public<T extends View>List<T> findByCostLessThan(double cost, Class<T> cls);
}
