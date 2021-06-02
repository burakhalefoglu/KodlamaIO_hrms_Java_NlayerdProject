package com.kodlamaio.hrms.entites.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_schools")
public class UserSchool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;
	
	@Column(name = "is_graduated")
	public Boolean isGraduated ;
	
	@Column(name = "registration_date")
	public Date registrationDate;
	
	@Column(name = "graduate_date")
	public Date graduateDate;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)	
	public User user;
	
     @ManyToOne
	 @JoinColumn(name="school_id", nullable=false)	
	 public School school;
		
}
