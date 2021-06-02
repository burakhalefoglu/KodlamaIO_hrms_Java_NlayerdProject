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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_foreign_language")
public class UserForeignLanguage {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer id;
	
	 @ManyToOne
	 @JoinColumn(name="user_id", nullable=false)	
	 public User user;
	 
	 @ManyToOne
	 @JoinColumn(name="language_level_id", nullable=false)	
	 public ForeignLanguageLevel languageLevel;
	 
	 @ManyToOne
	 @JoinColumn(name="foreign_language_id", nullable=false)	
	 public ForeignLanguage foreignLanguage;
	
}
