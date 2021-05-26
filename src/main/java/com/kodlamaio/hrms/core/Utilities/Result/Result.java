package com.kodlamaio.hrms.core.Utilities.Result;

public class Result {


	private Boolean success;
	private String message ;
	
	public Result(Boolean success, String message) {
		this(success);
		this.message = message;
	}

	public Result(Boolean success) {
		this.success = success;
	}
	
	
	
}
