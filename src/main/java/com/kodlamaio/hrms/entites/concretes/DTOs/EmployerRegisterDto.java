package com.kodlamaio.hrms.entites.concretes.DTOs;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployerRegisterDto {

	@NotNull
	@NotBlank(message = "Email can not empty")
	@Email(message = "Email is not correct")
	public String email;
	
	@NotNull
	@NotBlank(message = "password can not empty")
	public String password;
	
	@NotNull
	@NotBlank(message = "password again can not empty")
	public String passwordAgain;
	
	@NotNull
	@NotBlank(message = "company name can not empty")
	public String companyName;
	
	@NotNull
	@NotBlank(message = "website can not empty")
	public String webiste;
	
	@NotNull
	@NotBlank(message = "tel no can not empty")
	public String tel;
}
