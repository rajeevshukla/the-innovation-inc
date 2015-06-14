package com.demo.encapsulation;

public class Consumer {

	public static void main(String[] args) {

		Divide divide=new Divide();

		divide.setX(20);
		divide.setY(0);
	  float result= divide.divide();

	  System.out.println("Result : "+result);
	  
	}
	
	
}
