package com.telusko;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.VaccineService;


@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	
		VaccineService service = container.getBean(VaccineService.class);

		//service.fetchByVaccineCompany("BharatBio").forEach(v->System.out.println(v));
//		service.fetchByVaccineCompany("BharatBio","Moderena").forEach(v->System.out.println(v));

//		service.fetchVaccinesByCost(45454.4, 454544.4).forEach(v->System.out.println(v));
//		int rowsAffected=service.updateThePriceByVaccineName(65454.4, "Covaxin");
//		if(rowsAffected!=0)
//			System.out.println("Update success");
//		else
//			System.out.println("Update failure");
//		int rowsAffected=service.deleteTheVaccinesByvaccineNames("Covaxin");
//		if(rowsAffected!=0)
//		System.out.println("Record deleted");
//	else
//		System.out.println("deletion failure");
//		int rowsAffected=service.insertVaccineDetails(4,"Covaxin", "BharatBio", 456534.5);
//
//		if(rowsAffected!=0)
//			System.out.println("New Record Added");
//		else
//			System.out.println("Failed to add new Record");
		System.out.println(service.getSystemDateAndTime());
		
	}
	

}
