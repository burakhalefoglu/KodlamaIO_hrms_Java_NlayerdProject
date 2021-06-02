package com.kodlamaio.hrms.entites.concretes;

import java.util.Date;
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

	@Column(name = "cover_letter")
	public String coverLetter;
	
	@Column(name = "linked_in_address")
	public String LinkedInAddress;
	
	@Column(name = "github_address")
	public String githubAddress;
	
	
	@OneToOne
	@MapKey
	@JoinColumn(name = "user_id")
	private User user;

}
