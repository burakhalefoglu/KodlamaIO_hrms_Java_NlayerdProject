package com.kodlamaio.hrms.business.abstracts;
import com.kodlamaio.hrms.entites.concretes.Employee;

import java.util.List;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;

public interface EmployeeService {
	
	DataResult<List<Employee>> getEmplyees();
}
