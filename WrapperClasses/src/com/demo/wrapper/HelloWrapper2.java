package com.demo.wrapper;

public class HelloWrapper2 {

	public static void main(String[] args) {
		
		
		
		
		
		  int x=300;
		   long y=x; //widening 
		   
		   float f=y; //widening..  
		   
		   
		   short s=(short)x;  //narrowing.. might be data loss.
		
		   
		    System.out.println(s);
		
		
		
		
		
		//in 1.5 
		Integer integer=2;
		 //integer =new Integer(2);
		
		Integer i=new Integer(2);

		integer++; //autounboxing and autoboxing is going on here.  
		// int temp=i.intValue(); 
		// i=new Integer(temp++);
		
		System.out.println(integer);
		
		
		
		//Wrapper classes are immutable. 
		
		String string="hello";
		String string2="hello";
		System.out.println("String comparision:"+(string==string2));
		
		Integer integer2=128;
		Integer integer3=128;
		
		System.out.println("Integer comparision:"+(integer2==integer3));
		
		
	}
}
