package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.BusinessPositionService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.BusinessPosition;

@RestController
@RequestMapping("/api/businesspositions")
public class BusinessPositionsController {

	private BusinessPositionService businessPositionService;

	@Autowired
	public BusinessPositionsController(BusinessPositionService businessPositionService) {
		this.businessPositionService = businessPositionService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<BusinessPosition>> getAll(){
		
		return businessPositionService.getAll();
	}
	
	@PostMapping("/")
	public Result add(@RequestBody BusinessPosition businessPosition ){
		
		return businessPositionService.addBusinessPosition(businessPosition);
	}
}
