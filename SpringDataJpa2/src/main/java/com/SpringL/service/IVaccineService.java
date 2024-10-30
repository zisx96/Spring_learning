package com.SpringL.service;

import com.SpringL.entity.Vaccine;

public interface IVaccineService {
	
	
	public String registerVaccineInfo(Vaccine vaccine);
	public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines);
	public Long vaccinesCount();
	public Boolean checkVaccineAvailability(Integer id);
	public Iterable<Vaccine> getAllVaccinesInfo();
	
}
