package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.UserJobExperience;

public interface UserJobExperienceDao extends JpaRepository<UserJobExperience, Integer>{

	List<UserJobExperience> getByUser_id(Sort sort, Integer id);
	
}
