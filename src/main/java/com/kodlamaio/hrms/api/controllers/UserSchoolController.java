package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.UserSchoolService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.entites.concretes.UserSchool;
import com.kodlamaio.hrms.entites.concretes.DTOs.UserSchoolDto;


@RestController
@RequestMapping("/api/userschool")
public class UserSchoolController {

	private UserSchoolService userSchoolService;

	@Autowired
	public UserSchoolController(UserSchoolService userSchoolService) {
		super();
		this.userSchoolService = userSchoolService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<UserSchool>> getAll(){
		
		return userSchoolService.getAll();
	}
	
	
	@GetMapping("/getschooldetail")
	public DataResult<List<UserSchoolDto>> getSchoolDetail(){
		
		return userSchoolService.getUsersAllSchoolDetails();
	}
	
	
}
