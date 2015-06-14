package com.demo.gc.test;

public class B {

	B a;
	
	
	public static void main(String[] args) {
		
		B a=new B();
		B b=new B();
		B c=new B();
		a.a=b;
        b.a=c;
        c.a=a;
		
        a=null;  // Ratnesh 2 object 
        b=null;  //  
        c=null; // 
        
        
        
        System.out.println("Done.");
        
        
        
		
	}
	
	
	 
}
