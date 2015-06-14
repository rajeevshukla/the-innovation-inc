package com.demo.wrapper;

public class WideningAndNarrowingOverloading {

	
	/*public void ab(byte b){
	System.out.println("in byte");	
	}
	*/
	/*public void ab(short b){
		System.out.println("in short");	
		}*/
		
	/*public void ab(int b){
		System.out.println("in int");	
		}
		*/
	/*public void ab(long b){
		System.out.println("in long");	
		}
		*/
	/*public void ab(float b){
		System.out.println("in float");	
		}
		*/
	/*public void ab(double b){
		System.out.println("in double");	
		}*/
		
	public void ab(char b){
		System.out.println("in char");	
		}
		
	/*
	public void ab(Byte b){
		System.out.println("in Byte autoboxing");	
		}
	*/
	public void ab (byte... b){
		System.out.println("in var arg");
	}
	
	public static void main(String[] args) {
		
		WideningAndNarrowingOverloading andNarrowingOverloading=new WideningAndNarrowingOverloading();
		andNarrowingOverloading.ab((byte)20);
	}
		
	
	
	
	
}

