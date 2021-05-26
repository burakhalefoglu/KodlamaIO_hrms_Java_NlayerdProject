package com.kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.AuthService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.DTOs.EmployeeRegisterDto;
import com.kodlamaio.hrms.entites.concretes.DTOs.EmployerRegisterDto;
import com.kodlamaio.hrms.entites.concretes.DTOs.LoginDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	
	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	
	@PostMapping("/login")
	public Result login(@RequestBody LoginDto loginDto) {
		
		return authService.Login(loginDto);
	}
	

	@PostMapping("/register/employee")
	public Result registerEmployee(@RequestBody EmployeeRegisterDto employee) {
		
		return authService.registerAsEmployee(employee);
	}
	
	
	@PostMapping("/register/employee")
	public Result registerEmployer(@RequestBody EmployerRegisterDto employer) {
		
		return authService.registerAsEmployer(employer);
	}

	
}
