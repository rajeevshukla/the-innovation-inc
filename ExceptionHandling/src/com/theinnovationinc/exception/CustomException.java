package com.theinnovationinc.exception;

public class CustomException extends Exception {

	public CustomException() {

	}

	public CustomException(Throwable cause){

		super(cause);
	}


	public CustomException(Throwable cause,String msg){

		super(msg,cause);
	}

	public CustomException(String message){

		 super(message);
	}

	
	@Override
	public void printStackTrace() {
	
		//i can put here a logger / log4j  ,, or write that excpetion on file here. 
		
		System.out.println("Writing exception on file::");
		super.printStackTrace();
		
	}
	
	

}
