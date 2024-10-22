package main;

import services.Icourse;

class Amaz{
	
	private Icourse icourse;
	
	Amaz(Icourse icourse){
		
		super();
		System.out.println("Constructor injection");
		this.icourse = icourse;
	}
	
	Amaz(){
		
		super();	
	}

	public Icourse getIcourse() {
		return icourse;
	}

	public void setIcourse(Icourse icourse) {
		this.icourse = icourse;
	}
	
	public boolean buyTheCourse(Double amount) {
		
		return icourse.getTheCourse(amount);
	}
	
}
