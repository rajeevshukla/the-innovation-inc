package com.demo.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadDrive {

	public static void main(String[] args) {


	/*String path=JOptionPane.showInputDialog("Enter directory path");
*/
		String path="";

	         BufferedReader reader=new  BufferedReader(new InputStreamReader(System.in));
	         /*
	         Scanner scanner=new Scanner(System.in);
	         scanner.next()*/
	       try {
	    	   System.out.println("Enter path name to list files : ");
			path= reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	File file=new File(path);

	File listOfFiles[]= file.listFiles();
	
	
	for (File file2 : listOfFiles) {
		   System.out.println(file2.getName()+" is directory : "+file.isDirectory());
		   
	}
		
		




	}

}
