package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	DataResult<List<ProgrammingLanguage>> getAll();
	
}