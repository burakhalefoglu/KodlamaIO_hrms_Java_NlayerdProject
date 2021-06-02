package com.kodlamaio.hrms.entites.concretes.DTOs;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSchoolDto {

	public String schoolName;
	public Date graduateDate;
	public Boolean isGraduated ;

}
