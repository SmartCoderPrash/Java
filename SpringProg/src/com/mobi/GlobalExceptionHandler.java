package com.mobi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * for Handing the exception, if any prob occures, then it return the error page. **/
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerExecption(Exception e)
	{
		System.out.println("Null Pointer Execption occured "+e);
		return "nullPointerExe";
	}
	
	/**To handle the all generic exception 
	 * this is also used to send the with along to http error code.**/
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String genericrExecption(Exception e)
	{
		System.out.println("Null Pointer Execption occured "+e);
		return "nullPointerExe";
	}

}
