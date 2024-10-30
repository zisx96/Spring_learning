package com.SpringL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringL.entity.Vaccine;
import com.SpringL.repo.IVaccine;

@Service
public class VaccineService implements IVaccineService {
	
	
	private IVaccine repo;
	
	@Autowired
	public void setRepo(IVaccine repo) {
		this.repo = repo;
	}

	@Override
	public String registerVaccineInfo(Vaccine vaccine) {
		
		Vaccine vac = repo.save(vaccine);
		
		return "Vaccine info registered with id " + vac.getId();
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines) {
		
		return repo.saveAll(vaccines);
	
	}

	@Override
	public Long vaccinesCount() {
		
		return repo.count();
	}

	@Override
	public Boolean checkVaccineAvailability(Integer id) {
		
		return repo.existsById(id);
		
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfo() {
		
		return repo.findAll();
		
	}

}
