package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.ForeignLanguageLevelService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.ForeignLanguageLevelDao;
import com.kodlamaio.hrms.entites.concretes.ForeignLanguageLevel;

@Service
public class ForeignLanguageLevelManager implements ForeignLanguageLevelService{

	private ForeignLanguageLevelDao foreignLanguageDao;
	
	@Autowired
	public ForeignLanguageLevelManager(ForeignLanguageLevelDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public DataResult<List<ForeignLanguageLevel>> getAll() {
		
		return new SuccessDataResult<List<ForeignLanguageLevel>>(foreignLanguageDao.findAll());
	}

}
