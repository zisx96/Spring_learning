package com.SpringL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringL.service.VaccineService;
import com.SpringL.view.ResultView1;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

		service.fetchByCostLessThan(4500.32, ResultView1.class).
		forEach((v)-> System.out.println(v.getVaccine_name()+" "+ v.getVaccineCompany()));
		
		
		
	}	

}
