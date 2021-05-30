package com.kodlamaio.hrms.entites.concretes;

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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisement_programming_languages")
public class JobAdvertisementProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public short id;
	
	@ManyToOne
    @JoinColumn(name="programming_Language_id", nullable=false)	
	public ProgrammingLanguage programmingLanguage;
	
	@ManyToOne
    @JoinColumn(name="job_advertisements_id", nullable=false)	
	public JobAdvertisement jobAdvertisement;
	
}
