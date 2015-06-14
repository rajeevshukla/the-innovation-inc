package com.demo.wrapper;

public class HelloWrapper {

	public static void main(String[] args) {
	
		
		Integer integer=new Integer("2");  //boxing
		
		byte b =20;
		
		
		
		 float f=230.9f;
         double d=20.0;		 
		 
		Float float1=new Float(23.2);
		System.out.println(integer);

		 int x=integer.intValue();  //unboxing
		
 
		 
		   //String to primitive. 
		 
		   String s="3000adbc";
		   
		   
		  int ab=Integer.parseInt(s); // exception 
		   
		  
		  //XXXX.parseXXX();
		   Float.parseFloat(s);
		   Double.parseDouble(s);
		   
		  System.out.println(ab);
		
		  
		  String s2=  Integer.toString(150,16);
		  
		  System.out.println(s2);
		  
		  
		
		
		
		
		
		
		
		
	}
	
	@Override
	public String toString() {
	return "theInnovationinc@"+Integer.toHexString(hashCode());
	}
}
