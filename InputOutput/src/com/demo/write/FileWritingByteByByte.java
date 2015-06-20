package com.demo.write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingByteByByte {
public static void main(String[] args) {


	FileOutputStream fileWrite=null;


	try {
		 fileWrite=new FileOutputStream("C:\\Users\\rajeev.shukla\\Desktop\\java session\\hello.txt",true);
		 String dataToWrite="hii this is my dummy data in want to write !";
          fileWrite.write(dataToWrite.getBytes()); //IF NOTHING FOUND -1 WILL BE RETURNED. 

		  fileWrite.flush();

		System.out.println("File has been written successfully.");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		 if(fileWrite!=null){
			 try {
				fileWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		
	}


}
}
