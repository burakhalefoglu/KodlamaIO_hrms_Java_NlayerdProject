package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.EmployerService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrms.entites.concretes.Employee;
import com.kodlamaio.hrms.entites.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getEmployers() {
		
		var result = employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(result);
	}

}
