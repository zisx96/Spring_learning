package services;

class Java implements Icourse {
	
	public Java(){
		
		System.out.println("java bean");
	}
	
	@Override
	public boolean getTheCourse(Double amount) {
		
		System.out.println("java course purchased");
		return true;
	}
	
	
}
