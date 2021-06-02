package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.core.Utilities.Result.DataResult;
import com.kodlamaio.hrms.entites.concretes.UserJobExperience;

@Service
public interface UserJobExperienceService {

	DataResult<List<UserJobExperience>> getByUser_id(Integer id);

}
