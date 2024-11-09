package com.SpringL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringL.service.VaccineService;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);

//		Vaccine vac1 = new Vaccine("AstraZeneca","Vaxzevria",3421.54);
//		
//		vac1.setId(2);
//		
//		service.searchByVaccineByGivenInfo(vac1).forEach((v)-> System.out.println(v));
		
//		List<Integer> ids = new ArrayList<>();
//		ids.add(3);
//		ids.add(1);
//		ids.add(45);
//	
//		String s = service.removeVaccineInfoById(ids);
//		
//		System.out.println(s);
		
//		Vaccine vac1 = new Vaccine("Sinopharm", "BBIBP-CorV", 4442.67);
//			
//		Vaccine vac2 = new Vaccine("AstraZeneca", "Vaxzevria", 2422.77);
//			
//		Vaccine vac3 = new Vaccine("CanSinoBIO", "Convidecia", 5432.09);
//		
//		List<Vaccine> v = new ArrayList<>();
//		
//		v.add(vac1);
//		v.add(vac2);
//		v.add(vac3);
//		
//		service.addVaccineInBatch(v).forEach((e) -> System.out.println(e));
		
		service.fetchByCost(4500.04).forEach((v) -> System.out.println(v.getVaccine_name()+" "+ v.getVaccineCompany()));
		
	}	

}
