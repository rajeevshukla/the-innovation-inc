package com.theinnc.set;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee paramT1, Employee paramT2) {
	
		 if(paramT1.getSalary()>paramT2.getSalary()){
			 return -1;
			 
		 }else if(paramT1.getSalary()<paramT2.getSalary()){
			 return 1;
		 }else {
			 return 0;
		 }
	
	}
}

