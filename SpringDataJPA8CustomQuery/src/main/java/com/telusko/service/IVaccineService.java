package com.telusko.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.telusko.entity.Vaccine;


public interface IVaccineService 
{
	public List<Vaccine> fetchByVaccineCompany(String companyName);
	public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);
	public List<String> fetchVaccinesByCost(Double startingRange, Double maxRange);
	public int updateThePriceByVaccineName(Double newPrice, String vaccineName);
	public int deleteTheVaccinesByvaccineNames(String vaccineName);
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Double cost);
	public Date getSystemDateAndTime();






}
