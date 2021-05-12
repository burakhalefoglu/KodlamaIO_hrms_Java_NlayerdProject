package com.kodlamaio.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="business_positions")
public class BusinessPosition {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int Id;
	
	@Column(name="name")
	private String name;
	
	
}
