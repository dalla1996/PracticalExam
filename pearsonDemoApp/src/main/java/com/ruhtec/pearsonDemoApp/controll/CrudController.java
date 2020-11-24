package com.ruhtec.pearsonDemoApp.controll;
import com.ruhtec.pearsonDemoApp.services.*;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruhtec.pearsonDemoApp.model.Employee;
import com.ruhtec.pearsonDemoApp.services.CrudService;

import antlr.collections.List;

@RestController
public class CrudController {
	
	@Autowired  
	private CrudService service;
	
	@GetMapping("/getemployeelist") 
	public java.util.List<Employee> fetchEmployeeList(){
		java.util.List<Employee> employees =new ArrayList<Employee>();
		// to fetch list from database
		employees=service.fetchEmployeeList();
		return employees;
		
	}
	
	@PostMapping("/insertemployeelist") 
	private Employee insertEmployee(@RequestBody Employee employee) {
		return service.insertEmployeeDB(employee);
	}
	@GetMapping("/getemployeebyid/{id}") 
	public Employee fetchEmployeebyID(@PathVariable int id) {
			return  service.fetchEmployeeByID(id).get();
	}
	
	@GetMapping("/deleteemployeebyid/{id}")  
	private String deleteEmployeeByID(@PathVariable int id) {
		return service.deleteEmployeeByID(id);
		
	}
		
	
		  
		
	
}
