package com.telusko.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.entity.Vaccine;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine,Integer>
{

}
