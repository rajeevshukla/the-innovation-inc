package com.theinnce.enumt;

public class ColorCodeImpl {
	
	public void processingColor(){
		
		int colorCode=ColorCodeWT.RED;
		
		ColorCodeEnum selectedColorCodeEnum=ColorCodeEnum.RED;
		
		
		
		//
		//
		//
		//
		//
		colorCode=45;
		selectedColorCodeEnum=ColorCodeEnum.YELLOW;
	}

	
	public static void main(String[] args) {
		
		
		System.out.println(ColorCodeEnum.valueOf("RED"));
	}
}
