package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.Employee;
import com.kodlamaio.hrms.entites.concretes.User;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Employee findByIdentityNumber(String identityNumber);

	
}
