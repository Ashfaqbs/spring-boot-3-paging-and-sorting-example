package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String name;
	private String company;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String name, String company, double salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}

	
	
	
}
