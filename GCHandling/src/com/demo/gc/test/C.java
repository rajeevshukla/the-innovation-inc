package com.demo.gc.test;


public class C {

 static int i=0;
 
 int x;
	@Override
	protected void finalize() throws Throwable {
	  i++;
	  System.out.println(this.x);
	}
	
	
	public static void main(String[] args) {
		C  a;
		 for (int i = 1; i <= 10; i++) {
			 a=new C();
			 a.x=i;
		}
		 //
		System.gc();
		
		//System.out.println(a);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		 
		 System.out.println("No of object gabage collected ="+i);
		 
		
	}
}
