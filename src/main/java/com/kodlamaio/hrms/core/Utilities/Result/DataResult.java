package com.kodlamaio.hrms.core.Utilities.Result;

public class DataResult<T> extends Result{

	private T data;
	
	public DataResult(Boolean success, String message, T data) {
		super(success, message);
		this.data = data;
	}

	public DataResult(Boolean success, T data) {
		super(success);
		this.data = data;
	}
	
		
}
