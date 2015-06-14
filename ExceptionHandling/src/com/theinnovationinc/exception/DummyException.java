package com.theinnovationinc.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DummyException {

	public static void main(String[] args) {
		
		
		System.out.println("Strting try.");
		
		FileInputStream fileInputStream=null;
 
		 try  {
			
			   fileInputStream=new FileInputStream("C:\\install.log");
			  // CREATES object of FileNotFoundException put some message into object
			  //throw new FileNotFoundException(jsd found found);
			  fileInputStream.read();
			  System.out.println("Try method completed.");
		} catch (IOException e) {
			
			System.out.println("catch method");
			e.printStackTrace();
			
		}catch (Exception e) {
             e.printStackTrace();

		} finally {

			System.out.println("Finaly must execute. ");
            if(fileInputStream!=null){
			   try {
				fileInputStream.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		   }
			
		}
		  
		  System.out.println("Existing main method.,");
		  
		
	}
}
