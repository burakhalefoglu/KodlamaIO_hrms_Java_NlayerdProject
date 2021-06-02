package com.kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.UserJobExperienceService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;

@RestController
@RequestMapping("/api/userjobexperience")
public class UserJobExperienceController {

	private UserJobExperienceService userJobExperienceService;

	@Autowired
	public UserJobExperienceController(UserJobExperienceService userJobExperienceService) {
		super();
		this.userJobExperienceService = userJobExperienceService;
	}
	
	
	@GetMapping("/getbyuserid")
	public Result getByUser_id(@RequestBody Integer id){
		
		return userJobExperienceService.getByUser_id(id);
	}
	
}
