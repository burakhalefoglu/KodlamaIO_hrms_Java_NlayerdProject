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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_job_experience")
public class UserJobExperience {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;
	
	@Column(name = "name")
	public String name;

	@Column(name = "position")
	public String position;
	
	@Column(name = "started_date")
	public Date startedDate;
	
	@Column(name = "finished_date")
	public Date finishedDate;
	
	 @ManyToOne
	 @JoinColumn(name="user_id", nullable=false)	
	 public User user;
}
