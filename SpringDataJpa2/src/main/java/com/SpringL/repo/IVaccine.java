package com.SpringL.repo;

import org.springframework.data.repository.CrudRepository;

import com.SpringL.entity.Vaccine;

public interface IVaccine extends CrudRepository<Vaccine, Integer> {

}
