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
		service.fetchByCost(3421.54).forEach(v->System.out.println(v));
//		service.fetchByCostLessThanEqual(454455.4).forEach(v->System.out.println(v));
//		service.fetchByCostBetween(45445.4, 4544554.4).forEach(v->System.out.println(v));
//		service.fetchByVaccineCompanyEquals("Astrazenica").forEach(v->System.out.println(v));
		
//		Collection<String> vaccineNames=new HashSet<>();
//		vaccineNames.add("CovidShield");
//		vaccineNames.add("Phizer");
//		service.fetchdByVaccineNameInAndCostBetween(vaccineNames, 2545.4, 5554.4).forEach(v->System.out.println(v));

		
		
	}
	

}
