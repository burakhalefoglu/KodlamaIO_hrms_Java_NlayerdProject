package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.ProgrammingLanguage;

public interface ProgrammingLangguageDao  extends JpaRepository<ProgrammingLanguage, Integer>{

}
