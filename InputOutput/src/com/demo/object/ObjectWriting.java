package com.demo.object;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriting {
	
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

		
		Employee employee=new Employee(101, "abc", 24);
		 employee.setAddress(new Address());
		Employee employee2=new Employee(102, "abcd", 25);
        employee2.setAddress(new Address());
		try {
			FileOutputStream outputStream=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(outputStream);
			
			oos.writeObject(employee);

			oos.writeObject(employee2);
			oos.flush();
			oos.close();
			outputStream.close();
			System.out.println("Object written successfully.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
