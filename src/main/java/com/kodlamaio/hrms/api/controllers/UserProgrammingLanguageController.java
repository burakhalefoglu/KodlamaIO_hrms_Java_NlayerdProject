package com.kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.UserProgrammingLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.UserProgrammingLanguage;

@RestController
@RequestMapping("/api/userprograminglanguage")
public class UserProgrammingLanguageController {

	private UserProgrammingLanguageService userProgrammingLanguageService;

	@Autowired
	public UserProgrammingLanguageController(UserProgrammingLanguageService userProgrammingLanguageService) {
		super();
		this.userProgrammingLanguageService = userProgrammingLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody UserProgrammingLanguage userProgrammingLanguage ){
		
		return userProgrammingLanguageService.addUserProgrammingLanguage(userProgrammingLanguage);
	}
}
