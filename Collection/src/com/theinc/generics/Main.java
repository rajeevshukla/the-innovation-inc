package com.theinc.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

/*	public void ab(List<? extends Person> personList) {
		personList.add(null);
		
	  for (Person person : personList) {
		
		   
		  
	}

	}*/
	
	
	public void ab(List <?  super Person> personList){
		
		personList.add(new Student());
		
	}

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();

		Main main = new Main();
		//main.ab(studentList);
		
		

		Template<String> template = new Template<String>();
		// template.ab(x);

		Template<Integer> template2 = new Template<Integer>();
		// template2.ab(x);
	//	Collections.copy(, src);

		NonGenericClass.<String> ab("ab");

		// Collections.copy(dest, src);

	}
}
