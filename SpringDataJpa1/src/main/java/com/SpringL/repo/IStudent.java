package com.SpringL.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringL.entity.Student;

@Repository	// if don't write no issue 
public interface IStudent extends CrudRepository<Student, Integer> {
	
	
	
}
