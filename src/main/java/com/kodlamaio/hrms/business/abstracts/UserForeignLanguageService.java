package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.UserForeignLanguage;
import com.kodlamaio.hrms.entites.concretes.DTOs.UserForeignLanguageDto;

public interface UserForeignLanguageService {

	  Result addUserForeignLanguage(UserForeignLanguage userForeignLanguage);
}
