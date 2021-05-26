package com.kodlamaio.hrms.entites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name = "id")
	public int id;
	@Column(name = "name")
	public String name;
	@Column(name = "surname")
	public String surname;
	@Column(name = "identity_number")
	public String identityNumber;
	@Column(name = "birthday")
	public Date birthDay;
	
}
