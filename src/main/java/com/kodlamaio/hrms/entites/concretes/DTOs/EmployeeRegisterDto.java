package com.kodlamaio.hrms.entites.concretes.DTOs;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegisterDto {

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
	@NotBlank(message = "name can not empty")
	public String name;
	
	@NotNull
	@NotBlank(message = "surname can not empty")
	public String surname;
	
	@NotNull
	@NotBlank(message = "identityNumber can not empty")
	public String identityNumber;
	
	@NotNull()
	@NotBlank(message = "Birtday can not empty")
	public Date birthDay;
	
}
