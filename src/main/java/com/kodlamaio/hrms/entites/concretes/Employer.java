package com.kodlamaio.hrms.entites.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employers")
public class Employer {

	@Id
	@Column(name = "id")
	public int id;
	@Column(name = "company_name")
	public String companyName;
	@Column(name = "website")
	public String webiste;
	@Column(name = "tel")
	public String tel;

	@OneToOne
	@MapKey
	@JoinColumn(name = "user_id")
	private User user;
	
	
	@OneToMany(mappedBy  = "employer")
	public List<JobAdvertisement> jobAdvertisement;
	
}
