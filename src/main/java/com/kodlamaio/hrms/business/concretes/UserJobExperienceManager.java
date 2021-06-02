package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.UserJobExperienceService;
import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.core.Utilities.Result.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.UserJobExperienceDao;
import com.kodlamaio.hrms.entites.concretes.UserJobExperience;

@Service
public class UserJobExperienceManager implements UserJobExperienceService{

	private UserJobExperienceDao userJobExperienceDao;
	
	@Autowired
	public UserJobExperienceManager(UserJobExperienceDao userJobExperienceDao) {
		super();
		this.userJobExperienceDao = userJobExperienceDao;
	}

	@Override
	public DataResult<List<UserJobExperience>> getByUser_id(Integer id) {
		
		Sort sort = Sort.by(Sort.Direction.DESC,"startedDate");
		return new SuccessDataResult<List<UserJobExperience>>(userJobExperienceDao.getByUser_id(sort, id));
	}

}
