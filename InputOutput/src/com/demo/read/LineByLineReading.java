package com.demo.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineByLineReading {

	
	public static void main(String[] args) {

		FileReader fr=null;

		
		File file=new File("C:\\Users\\rajeev.shukla\\workspace\\InputOutput\\src\\com\\demo\\read\\FileReadingByByteByByte.java");
		

		try {

			 if(!file.exists()){
				 throw new FileNotFoundException("Given file does not exist.");
			 }
			
			fr=new FileReader(file);

			 BufferedReader br=new BufferedReader(fr);
		
			 String line=null;
			 while((line=br.readLine())!=null){
				 
				 System.out.println(line);
			 }

			


			System.out.println("File has been read successfully.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 if(fr!=null){
				 try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
			
		}

	
		
	}
}
