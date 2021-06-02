package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.UserProgrammingLanguage;

public interface UserProgrammingLanguageDao extends JpaRepository<UserProgrammingLanguage, Integer>{

}
