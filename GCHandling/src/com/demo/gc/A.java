package com.demo.gc;

public class A {
 
	static A gcObject ;
	
	int creditCardDetails;
	
	@Override
	protected void finalize() throws Throwable {
	
		System.out.println("Finalize method has been called.");
		
		
		gcObject=this;
	}
	
	
	public static void main(String[] args) {
		
	  A a=new A();
	  
	  a.creditCardDetails=200;
	  
	  
	   a=null;   //
	   
	   
	   System.gc(); // requeting to execute Garbage collector. 
	  //System.out.println( a.creditCardDetails); 
	  
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   System.out.println("Gc executed...");
	  
		
		
	}
}
