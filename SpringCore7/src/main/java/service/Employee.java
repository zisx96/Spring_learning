package service;

public class Employee {
	
	private Integer empId;
	private String name;
	private Double salaray;
	private String city;
	
//	private Department depart;
	
	public Employee(Integer empId, String name, Double salaray, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.salaray = salaray;
		this.city = city;
//		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salaray=" + salaray + ", city=" + city + "]";
	}
	
	public String employeeTask() {
		
		return "Every employee acts productive but in reality they are less productive.";
	}
	
}
