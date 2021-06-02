package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.UserSchoolService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.UserSchoolDao;
import com.kodlamaio.hrms.entites.concretes.JobAdvertisement;
import com.kodlamaio.hrms.entites.concretes.UserSchool;
import com.kodlamaio.hrms.entites.concretes.DTOs.UserSchoolDto;

@Service
public class UserSchoolManager implements UserSchoolService{

	private UserSchoolDao userSchoolDao;
	
	@Autowired
	public UserSchoolManager(UserSchoolDao userSchoolDao) {
		super();
		this.userSchoolDao = userSchoolDao;
	}

	@Override
	public DataResult<List<UserSchool>> getAll() {
		return new SuccessDataResult<List<UserSchool>>(userSchoolDao.findAll());
	}

	@Override
	public DataResult<List<UserSchoolDto>> getUsersAllSchoolDetails() {
		Sort sort = Sort.by(Sort.Direction.DESC,"graduateDate");
		return new SuccessDataResult<List<UserSchoolDto>>(userSchoolDao.getUsersAllSchoolDetails(sort));
		
	}

}
