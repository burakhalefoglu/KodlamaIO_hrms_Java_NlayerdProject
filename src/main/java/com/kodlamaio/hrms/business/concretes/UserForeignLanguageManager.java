package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.UserForeignLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.UserForeignLanguageDao;
import com.kodlamaio.hrms.entites.concretes.UserForeignLanguage;
import com.kodlamaio.hrms.entites.concretes.UserProgrammingLanguage;
import com.kodlamaio.hrms.entites.concretes.DTOs.UserForeignLanguageDto;

@Service
public class UserForeignLanguageManager implements UserForeignLanguageService {

	private UserForeignLanguageDao userForeignLanguageDao;

	@Autowired
	public UserForeignLanguageManager(UserForeignLanguageDao userForeignLanguageDao) {
		super();
		this.userForeignLanguageDao = userForeignLanguageDao;
	}


	@Override
	public Result addUserForeignLanguage(UserForeignLanguage userForeignLanguage) {
		userForeignLanguageDao.save(userForeignLanguage);
		return new SuccessResult("Dil eklendi");
	}

}
