package com.SpringL.service;

import java.util.List;

import com.SpringL.entity.Vaccine;

public interface IVaccineService {
	
	public Vaccine searchByVaccine(Integer id);
	public List<Vaccine> searchByVaccineByGivenInfo(Vaccine vac);
	public String removeVaccineInfoById(Iterable<Integer> ids);
	public Iterable<Vaccine> addVaccineInBatch(List<Vaccine> vac);

}
