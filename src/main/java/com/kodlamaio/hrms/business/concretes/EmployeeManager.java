package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.EmployeeService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import com.kodlamaio.hrms.entites.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao emplyeeDao;

	@Autowired
	public EmployeeManager(EmployeeDao emplyeeDao) {
		super();
		this.emplyeeDao = emplyeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {

		var result = emplyeeDao.findAll();
		return new SuccessDataResult<List<Employee>>(result);
	}

}
