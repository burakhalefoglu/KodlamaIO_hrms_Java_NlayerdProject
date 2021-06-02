package com.kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.AuthService;
import com.kodlamaio.hrms.core.Utilities.Result.ErrorResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrms.dataAccess.abstracts.UserDao;
import com.kodlamaio.hrms.entites.concretes.Employee;
import com.kodlamaio.hrms.entites.concretes.Employer;
import com.kodlamaio.hrms.entites.concretes.User;
import com.kodlamaio.hrms.entites.concretes.DTOs.EmployeeRegisterDto;
import com.kodlamaio.hrms.entites.concretes.DTOs.EmployerRegisterDto;
import com.kodlamaio.hrms.entites.concretes.DTOs.LoginDto;

@Service
public class AuthManager implements AuthService {

	private UserDao userDao;
	private EmployeeDao employeeDao;
	private EmployerDao employerDao;

	@Autowired
	public AuthManager(UserDao userDao, EmployeeDao employeeDao, EmployerDao employerDao) {
		this.userDao = userDao;
		this.employeeDao = employeeDao;
		this.employerDao = employerDao;
	}

	@Override
	public Result Login(LoginDto loginDto) {

		return new SuccessResult("login successfuly");
	}

	@Override
	public Result registerAsEmployee(EmployeeRegisterDto employeeRegisterDto) {

		var result = userDao.findByEmail(employeeRegisterDto.email);
		if (result != null) {
			return new ErrorResult("This email already registered");
		}

		var resultidentity = employeeDao.findByIdentityNumber(employeeRegisterDto.identityNumber);
		if (resultidentity != null) {
			return new ErrorResult("This identitynumber already registered");
		}

		// Will add user after password hash
		userDao.save(new User());
		employeeDao.save(new Employee());
		return new SuccessResult("register successfuly");

	}

	@Override
	public Result registerAsEmployer(EmployerRegisterDto employerRegisterDto) {

		var result = userDao.findByEmail(employerRegisterDto.email);
		if (result != null) {
			return new ErrorResult("This email already registered");
		}
		// Will add user after password hash
		userDao.save(new User());
		employerDao.save(new Employer());

		return new SuccessResult("register successfuly");
	}

}
