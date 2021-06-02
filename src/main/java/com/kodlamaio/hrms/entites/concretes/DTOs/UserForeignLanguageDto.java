package com.kodlamaio.hrms.entites.concretes.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForeignLanguageDto {

	public String UserName;
	public String ForeignLanguageName;
	public short ForeignLanguageLevel;
	
}
