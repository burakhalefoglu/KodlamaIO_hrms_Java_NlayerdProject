package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.ProgrammingLangguageDao;
import com.kodlamaio.hrms.entites.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLangguageDao programmingLanguageDao;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLangguageDao programmingLanguageDao) {
		super();
		this.programmingLanguageDao = programmingLanguageDao;
	}


	@Override
	public DataResult<List<ProgrammingLanguage>> getAll() {
		
		return new SuccessDataResult<List<ProgrammingLanguage>>(programmingLanguageDao.findAll());
	}

}
