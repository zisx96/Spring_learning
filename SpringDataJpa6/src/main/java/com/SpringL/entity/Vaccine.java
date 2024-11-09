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
	
	private String vaccine_name;
	
	private String vaccineCompany;
	
	private Double cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccine_name() {
		return vaccine_name;
	}

	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Vaccine(String vaccine_name, String vaccineCompany, Double cost) {
		super();
		this.vaccine_name = vaccine_name;
		this.vaccineCompany = vaccineCompany;
		this.cost = cost;
	}

	public Vaccine() {
		super();
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", Vaccine_name=" + vaccine_name + ", VaccineCompany=" + vaccineCompany + ", cost="
				+ cost + "]";
	}
	
}
