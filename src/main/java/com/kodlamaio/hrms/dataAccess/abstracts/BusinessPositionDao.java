package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.BusinessPosition;


public interface BusinessPositionDao extends JpaRepository<BusinessPosition, Short>{

}
