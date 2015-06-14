package com.theinnovationinc.interface1;

public class Student2 implements MyInterface{

	
	public void write(){ 
		 System.out.println("Student 2 is wrting ");
	}
	
	@Override
	public void read() {
 
		 System.out.println("student 2 is reading");
		
	}
	
}
