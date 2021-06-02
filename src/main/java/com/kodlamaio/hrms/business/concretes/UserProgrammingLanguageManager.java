package com.kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.UserProgrammingLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.UserProgrammingLanguageDao;
import com.kodlamaio.hrms.entites.concretes.UserProgrammingLanguage;

@Service
public class UserProgrammingLanguageManager implements UserProgrammingLanguageService{

	private UserProgrammingLanguageDao userProgrammingLanguageDao;
	
	@Autowired
	public UserProgrammingLanguageManager(UserProgrammingLanguageDao userProgrammingLanguageDao) {
		super();
		this.userProgrammingLanguageDao = userProgrammingLanguageDao;
	}

	@Override
	public Result addUserProgrammingLanguage(UserProgrammingLanguage userProgrammingLanguage) {
		userProgrammingLanguageDao.save(userProgrammingLanguage);
		return new SuccessResult("Ekleme başarılı!");
	}

}
