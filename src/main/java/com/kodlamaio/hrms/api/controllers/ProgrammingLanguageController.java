package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.ProgrammingLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.entites.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguageController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<ProgrammingLanguage>> getAll(){
		
		return programmingLanguageService.getAll();
	}
}
