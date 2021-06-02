package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.ForeignLanguageLevel;

public interface ForeignLanguageLevelDao extends JpaRepository<ForeignLanguageLevel, Short>{

}
