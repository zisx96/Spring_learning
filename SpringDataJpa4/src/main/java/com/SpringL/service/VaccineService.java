package com.SpringL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public Vaccine searchByVaccine(Integer id) {
		
		return repo.getReferenceById(id);

	}

	@Override
	public List<Vaccine> searchByVaccineByGivenInfo(Vaccine vac) {
		
//		Sort sort = Sort.by(status? Direction.ASC : Direction.DESC, params);
		
		Example<Vaccine> ex = Example.of(vac);
		
		return repo.findAll(ex);
		
	}

	@Override
	public String removeVaccineInfoById(Iterable<Integer> ids) {
		
		List<Vaccine> list = repo.findAllById(ids);
		
		if(list.size() != 0) {
			
			repo.deleteAllByIdInBatch(ids);
			return "records deleted for given ids";
		}
		return "unable to delete records";
	}

	@Override
	public Iterable<Vaccine> addVaccineInBatch(List<Vaccine> vac) {
		
		return repo.saveAll(vac);
		
	}
	
	
	

}
