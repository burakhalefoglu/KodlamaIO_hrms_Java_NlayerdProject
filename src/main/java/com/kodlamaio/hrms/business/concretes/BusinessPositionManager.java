package com.kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.BusinessPositionService;
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
	public List<BusinessPosition> getAll() {
		
		return businessPositionDao.findAll();
	}
	
}
