package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.entites.concretes.Employer;

import java.util.List;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;

public interface EmployerService {

	DataResult<List<Employer>> getEmployers();

}
