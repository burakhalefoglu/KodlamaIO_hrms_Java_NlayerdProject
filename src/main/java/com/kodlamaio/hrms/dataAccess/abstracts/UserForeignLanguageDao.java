package com.kodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import com.kodlamaio.hrms.entites.concretes.UserForeignLanguage;

public interface UserForeignLanguageDao extends JpaRepository<UserForeignLanguage, Integer>{
	 
	
}
