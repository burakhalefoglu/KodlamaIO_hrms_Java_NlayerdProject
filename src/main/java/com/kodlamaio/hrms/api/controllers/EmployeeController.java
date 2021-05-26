package com.kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.EmployeeService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public Result getEmployees(){
		
		return employeeService.getEmplyees();
	}
	
}
