package com.theinnovationinc.exception;

import java.io.FileInputStream;

public class ExceptionDucking {

	
	public void  ab() throws Exception {
			
		try {
			FileInputStream	   fileInputStream=new FileInputStream("C:\\install.log");
			fileInputStream.close();
		} catch (Exception e) {

			 System.out.println("print log here. and throw msg agian.");
			throw new Exception("There was some problem");
		}
		
	}
	
	
	
	
	public void ab(int x,int y) throws CustomException{
		
		  if(y<10){
			  throw  new CustomException("Illegal value of y="+y);
		  }
		
	}
	
	public static void main(String[] args) throws CustomException {
		
		ExceptionDucking ducking=new ExceptionDucking();
		
		
		try {
			ducking.ab(20, 2);
		} finally{
			System.out.println("inside finally.");
		}
		
		
	}
	
	
	
	
}
