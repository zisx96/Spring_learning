package service;

public class Department {
	
	private Integer deptNo;
	private String dpName;
	
	public Department(Integer deptNo, String dpName) {
		super();
		this.deptNo = deptNo;
		this.dpName = dpName;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", dpName=" + dpName + "]";
	}
	
}
