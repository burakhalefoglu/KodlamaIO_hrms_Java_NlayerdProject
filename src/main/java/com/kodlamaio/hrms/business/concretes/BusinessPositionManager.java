package com.kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.BusinessPositionService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.Result;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.BusinessPositionDao;
import com.kodlamaio.hrms.entites.concretes.BusinessPosition;


@Service
public class BusinessPositionManager implements BusinessPositionService{

	BusinessPositionDao businessPositionDao;

	@Autowired
	public BusinessPositionManager(BusinessPositionDao businessPositionDao) {
		this.businessPositionDao = businessPositionDao;
	}

	@Override
	public DataResult<List<BusinessPosition>> getAll() {
		
		return new SuccessDataResult<List<BusinessPosition>>(businessPositionDao.findAll());
	}

	@Override
	public Result addBusinessPosition(BusinessPosition businessPosition) {
		
		businessPositionDao.save(businessPosition);
		return new SuccessResult("ekleme Başarılı!");
	}
	
}
