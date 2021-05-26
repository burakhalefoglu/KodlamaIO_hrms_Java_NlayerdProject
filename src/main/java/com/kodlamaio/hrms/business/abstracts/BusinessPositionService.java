package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.entites.concretes.BusinessPosition;


public interface BusinessPositionService {

	DataResult<List<BusinessPosition>> getAll();
	Result addBusinessPosition(BusinessPosition businessPosition);
	
}
