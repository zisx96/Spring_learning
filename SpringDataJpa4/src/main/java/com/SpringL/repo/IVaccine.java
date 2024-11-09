package com.SpringL.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringL.entity.Vaccine;

public interface IVaccine extends JpaRepository<Vaccine, Integer> {
	
	
}
