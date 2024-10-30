package com.SpringL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity	
public class Vaccine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="v_id")
	private Integer id;
	
	private String Vaccine_name;
	
	private String VaccineCompany;
	
	private Double cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccine_name() {
		return Vaccine_name;
	}

	public void setVaccine_name(String vaccine_name) {
		Vaccine_name = vaccine_name;
	}

	public String getVaccineCompany() {
		return VaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		VaccineCompany = vaccineCompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Vaccine(String vaccine_name, String vaccineCompany, Double cost) {
		super();
		Vaccine_name = vaccine_name;
		VaccineCompany = vaccineCompany;
		this.cost = cost;
	}

	public Vaccine() {
		super();
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", Vaccine_name=" + Vaccine_name + ", VaccineCompany=" + VaccineCompany + ", cost="
				+ cost + "]";
	}
	
}
