package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entites.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);
	
}
