package com.demo.gc;

public class Child  extends Parent{

	 int x=40;
	
	public Child() {
		
		System.out.println("child constructor called.");
	}
	
	
	public static void main(String[] args) {
	
		
		Parent  child=new Child();
		
		
		System.out.println(child.x);
		
		
	}
}
