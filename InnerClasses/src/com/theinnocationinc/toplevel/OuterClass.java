package com.theinnocationinc.toplevel;


public class OuterClass {

	
	
	
	public static class InnerClass {
		
		public static void main(String[] args) {
			
			
			System.out.println("inn class main method.");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		OuterClass.InnerClass innerClass= new OuterClass.InnerClass();
		System.out.println("Outer class main method");
		
	}
	
}
