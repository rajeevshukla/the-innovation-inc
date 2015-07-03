package com.theinnce.enumt;

public enum ColorCodeEnum {

	RED(1),GREEN(2),YELLOW(3); //these are the object of this class 
	
	int value;
	///which is public static final in nature.
	
	private ColorCodeEnum(int x) {
		// TODO Auto-generated constructor stub
		this.value=x;
	}
	
	public void ab(){
		System.out.println("in ab methodS");
	}
	
	public int getValue() {
		return value;
	}
}
