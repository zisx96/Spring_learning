package services;

public class SpringBoot implements Icourse {
	
	public SpringBoot() {
		
		System.out.println("spring boot bean");
	}
	
	@Override
	public boolean getTheCourse(Double amount) {
			
		System.out.println("spring boot course purchased");
		return true;
			
	}    

}
