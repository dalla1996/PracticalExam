package com.ruhtec.pearsonDemoApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String job_title;
	private int salary;
	
	
	public Employee() {
		 
	}
	
	public Employee(int id, String name, String job_title, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
