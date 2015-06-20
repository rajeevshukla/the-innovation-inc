package com.demo.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingByByteByByte {

	public static void main(String[] args) {

		FileReader fis=null;


		try {
			 fis=new FileReader("C:\\Users\\rajeev.shukla\\workspace\\InputOutput\\src\\com\\demo\\read\\FileReadingByByteByByte.java");

			int b=fis.read(); //IF NOTHING FOUND -1 WILL BE RETURNED. 


			while(b!=-1){
				System.out.print((char)b);
				b=fis.read();  	  
			}


			System.out.println("File has been read successfully.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 if(fis!=null){
				 try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
			
		}

	}

}
