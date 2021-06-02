package com.kodlamaio.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.UserForeignLanguageService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.UserForeignLanguage;


@RestController
@RequestMapping("/api/userforeignLanguage")
public class UserForeignLanguageController {

	private UserForeignLanguageService userForeignLanguageSerivce;

	@Autowired
	public UserForeignLanguageController(UserForeignLanguageService userForeignLanguageSerivce) {
		super();
		this.userForeignLanguageSerivce = userForeignLanguageSerivce;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody UserForeignLanguage userForeignLanguage ){
		
		return userForeignLanguageSerivce.addUserForeignLanguage(userForeignLanguage);
	}
	
}
