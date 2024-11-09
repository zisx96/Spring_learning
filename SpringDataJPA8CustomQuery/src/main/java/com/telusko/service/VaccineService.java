package com.telusko.service;

import java.util.Collection;
import java.util.Date;
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
	public List<Vaccine> fetchByVaccineCompany(String companyName) 
	{
		
		return repo.searchByVaccineCompany(companyName);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
	
		return repo.searchByVaccineCompany(comp1, comp2);
	}

	@Override
	public List<String> fetchVaccinesByCost(Double startingRange, Double maxRange) {
		
		return repo.searchVaccinesByCost(startingRange, maxRange);
	}

	@Override
	public int updateThePriceByVaccineName(Double newPrice, String vaccineName) {
		
		return repo.updatePriceByVaccineName(newPrice, vaccineName);
	}

	@Override
	public int deleteTheVaccinesByvaccineNames(String vaccineName) 
	{
		
		return repo.deleteVaccinesByvaccineNames(vaccineName);
	}

	@Override
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost) {
		
		return repo.insertVaccineInfo(id,vaccineName, vaccineCompany, cost);
	}

	@Override
	public Date getSystemDateAndTime() {
		// TODO Auto-generated method stub
		return repo.getTheSystemDateAndTime();
	}

	
}
