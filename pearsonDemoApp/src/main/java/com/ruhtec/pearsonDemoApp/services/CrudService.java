package com.ruhtec.pearsonDemoApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruhtec.pearsonDemoApp.model.Employee;
import com.ruhtec.pearsonDemoApp.repo.CrudRepo;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	
	public List<Employee> fetchEmployeeList(){
		return repo.findAll();
		
	}
	
	public Employee insertEmployeeDB(Employee employee) {
		return repo.save(employee); 
	}
	
	public Optional<Employee> fetchEmployeeByID(int id) {
		return repo.findById(id);
	}
	public String deleteEmployeeByID(int id) {
		
		String result;
		try {
			repo.deleteById(id);
			result="delete operation sucessfully";
		} catch (Exception e) {
			result="delete operation not sucessfully";
		}
		return result;
	
	}
	 
	

}
