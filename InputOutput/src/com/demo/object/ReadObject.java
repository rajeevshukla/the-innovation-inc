package com.demo.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {

	public static void main(String[] args) {
		
		
		File file=new File("d:\\temp\\emp.db");
		
		try {
			if(!file.exists()){
				//file.mkdirs();
				file.createNewFile();
				System.out.println("File created successfully.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		Employee employee=null;;

		try {
			FileInputStream outputStream=new FileInputStream(file);
			ObjectInputStream oos=new ObjectInputStream(outputStream);
			
          Employee emp=(Employee) oos.readObject();
			
          while(emp!=null){
        	  
        	  System.out.println("Name : "+emp.getName());
        	  System.out.println("Id : "+emp.getId());
        	  System.out.println("Age : "+emp.getAge());
        	  emp=(Employee)oos.readObject();
          }
          
			
			oos.close();
			outputStream.close();
			System.out.println("Object written successfully.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
	}
}
