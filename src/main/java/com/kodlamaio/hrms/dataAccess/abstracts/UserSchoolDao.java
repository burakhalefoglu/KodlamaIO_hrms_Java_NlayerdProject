package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.kodlamaio.hrms.entites.concretes.UserSchool;
import com.kodlamaio.hrms.entites.concretes.DTOs.UserSchoolDto;

public interface UserSchoolDao extends JpaRepository<UserSchool, Integer>{

	 @Query("Select new com.kodlamaio.hrms.entites.concretes.DTOs.UserSchoolDto"
		  		+ "(s.name, u.graduateDate, u.isGraduated) "
		  		+ "From UserSchool u Inner Join u.school s")
		  List<UserSchoolDto> getUsersAllSchoolDetails(Sort sort);
	
}
