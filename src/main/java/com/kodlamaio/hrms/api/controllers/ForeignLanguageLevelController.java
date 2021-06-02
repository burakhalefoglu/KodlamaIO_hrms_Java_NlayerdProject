package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.entites.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignlanguagelevel")
public class ForeignLanguageLevelController {

	private ForeignLanguageService foreignLanguageService;

	@Autowired
	public ForeignLanguageLevelController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}

	@GetMapping("/getall")
	public DataResult<List<ForeignLanguage>> getAll(){
		
		return foreignLanguageService.getAll();
	}
	
}
