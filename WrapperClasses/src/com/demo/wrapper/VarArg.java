package com.demo.wrapper;

public class VarArg {

 
	//there must be only one var arg in method parameter
	// var arg param must be last parameter in method
	public void ab (int a,int... x){
	
		 for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	public static void main(String[] args) {
		VarArg arg=new VarArg();
		arg.ab(2,3,3,44,6,6,6,6,6,6,6,6,6,6);
		
		
	}
}
