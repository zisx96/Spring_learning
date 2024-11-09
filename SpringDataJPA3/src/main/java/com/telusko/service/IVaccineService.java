package com.telusko.service;

import java.util.List;
import java.util.Optional;

import com.telusko.entity.Vaccine;

public interface IVaccineService 
{
	
      public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties);
      
      public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize,boolean status, String... properties);
      public void fetchDetailsByPagination(int pageSize);

}
