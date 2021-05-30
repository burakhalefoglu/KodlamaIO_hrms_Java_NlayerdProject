package com.kodlamaio.hrms.api.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.Utilities.Result.Result;

@RestController
@RequestMapping("/api/jobadvertisement")
public class jobAdvertisementController  {

	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public jobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@GetMapping("/")
	public Result getAll(){
		
		return jobAdvertisementService.getAll();
	}
	
	@GetMapping("/sortedbydate")
	public Result getAllSorted(){
		
		return jobAdvertisementService.getAllSorted();
	}
	
	@GetMapping("/")
	public Result getByEmployer(@RequestParam int EmployerId){
		
		return jobAdvertisementService.getByEmployer(EmployerId);
	}
	
	@DeleteMapping("/")
	public Result deleteById(@RequestParam short id){
		
		return jobAdvertisementService.deletebyId(id);
	}
	
	
}
