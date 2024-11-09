package com.telusko.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties)
	{
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}


	@Override
	public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize, boolean status, String... properties) {
	//	Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status?Direction.ASC:Direction.DESC, properties);
		Page<Vaccine> page = repo.findAll(pageable);
		return page.getContent();
	}


	@Override
	public void fetchDetailsByPagination(int pageSize)
	{
		long count=4l;
		
		long pagecount=count/pageSize; //  4/2==>2   12/3=>4
		
		//14/5==>2.8 ==>3
		          //14%5==0?
		pagecount=count%pageSize==0?pagecount:++pagecount;
		
		for(int i=0;i<pagecount;i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			page.getContent().
			forEach(v->System.out.println(v.getVaccineName()+" "+v.getVaccineCompany()));
			System.out.println("----------------------------------------------");
		}
		
		
	}


}
