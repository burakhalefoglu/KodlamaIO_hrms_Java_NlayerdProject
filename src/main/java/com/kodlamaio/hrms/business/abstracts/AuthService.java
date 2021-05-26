package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.DTOs.EmployeeRegisterDto;
import com.kodlamaio.hrms.entites.concretes.DTOs.EmployerRegisterDto;
import com.kodlamaio.hrms.entites.concretes.DTOs.LoginDto;

public interface AuthService {
	
	Result Login(LoginDto loginDto);

	Result registerAsEmployee(EmployeeRegisterDto employeeRegisterDto);

	Result registerAsEmployer(EmployerRegisterDto employerRegisterDto);

}
