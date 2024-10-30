package com.SpringL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringL.entity.Vaccine;
import com.SpringL.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);
		
//		String status = service.registerVaccineInfo(new Vaccine("Phizer", "Moderena", 4354.54));
		
//		List<Vaccine> vaccines = new ArrayList<>();
//		
//		vaccines.add(new Vaccine("AstraZeneca", "Vaxzevria", 3421.54));
//		vaccines.add(new Vaccine("GlaxoSmithKline", "Shingrix", 2321.34));
//		vaccines.add(new Vaccine("Merck", "Gardasil", 5431.21));
//		
//		service.registerMultipleVaccineInfo(vaccines).forEach(v -> System.out.println(v));;
		
		Long count = service.vaccinesCount();
		System.out.println("Total number of vaccine in database are: " + count);
		
		int id = 2;
		
		Boolean status = service.checkVaccineAvailability(id);
		
		if(status)
			System.out.println("vaccine available");
		else
			System.out.println("not available");
		
		service.getAllVaccinesInfo().forEach(v -> System.out.println(v));
		
	}	

}
