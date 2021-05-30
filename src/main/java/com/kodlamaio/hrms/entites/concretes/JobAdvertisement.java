package com.kodlamaio.hrms.entites.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	
	@Column(name = "position_count")
	private short positionCount;
	
	@Column(name = "application_deadline")
	private Date applicationDeadline;
	
	@Column(name = "salary_min")
	private int salaryMin;
	
	@Column(name = "salary_max")
	private int salaryMax;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	
	@OneToMany(mappedBy  = "jobAdvertisement")
	public List<JobAdvertisementProgrammingLanguage> jobAdvertisementProgrammingLanguage;
	
	@ManyToOne
    @JoinColumn(name="business_position_id", nullable=false)	
	public BusinessPosition businessPosition;
	
	@ManyToOne
    @JoinColumn(name="city_id", nullable=false)	
	public City city;
	
	@ManyToOne
    @JoinColumn(name="employer_id", nullable=false)	
	public Employer employer;
	
}


