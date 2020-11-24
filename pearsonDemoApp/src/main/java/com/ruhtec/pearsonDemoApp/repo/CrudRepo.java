package com.ruhtec.pearsonDemoApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruhtec.pearsonDemoApp.model.Employee;

public interface CrudRepo extends JpaRepository<Employee,Integer>{
	
}
