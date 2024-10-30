package com.SpringL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringL.entity.Student;
import com.SpringL.repo.IStudent;

@Component
public class DataJpaRunner implements CommandLineRunner {
	
	@Autowired
	private IStudent repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Student(2, "Karan", "Mumbai"));
		
		System.out.println(repo.getClass().getName());

	}

}
