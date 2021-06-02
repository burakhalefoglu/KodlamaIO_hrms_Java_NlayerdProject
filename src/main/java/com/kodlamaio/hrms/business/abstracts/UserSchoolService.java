package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.entites.concretes.UserSchool;
import com.kodlamaio.hrms.entites.concretes.DTOs.UserSchoolDto;

public interface UserSchoolService {

	DataResult<List<UserSchool>> getAll();
	DataResult <List<UserSchoolDto>> getUsersAllSchoolDetails();
}
