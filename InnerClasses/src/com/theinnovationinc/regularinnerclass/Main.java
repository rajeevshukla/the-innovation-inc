package com.theinnovationinc.regularinnerclass;

public class Main {

	
	 int x=30;
	
	
	public void ab(){
	 
		final  int i=20;
	 
		 class B {
	final static int x=20;		 
			 public  void ab(){
				 System.out.println("in ab method"+ Main.this.x +" "+20);
			 }
		 }
		 
		 B  b=new B();
		b.ab();
	
		 
	}
	
	
	public static void main(String[] args) {
		
		
		Main main=new Main();
		main.ab();
	}
}
