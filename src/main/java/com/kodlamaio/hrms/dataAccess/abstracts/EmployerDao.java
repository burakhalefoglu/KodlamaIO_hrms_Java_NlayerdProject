package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
