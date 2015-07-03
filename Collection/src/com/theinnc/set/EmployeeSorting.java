package com.theinnc.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSorting {

	public static void main(String[] args) {
		
		Set<Employee> set=new TreeSet<Employee>(new SalaryComparator());
		set.add(new Employee(101, "abc", 4032.f));
		set.add(new Employee(104, "abc", 2032.f));
		set.add(new Employee(102, "abc", 1032.f));
		set.add(new Employee(105, "abc", 45032.f));
		set.add(new Employee(103, "abc", 2432.f));
		System.out.println(set);
		 System.out.println(" befor remving : "+set.size());
		 set.remove(new Employee(105, "abc", 45032.f));
		 
		  for (Employee employee : set) {
			  if(employee.getId()==102){
				set.remove(employee);
			}
		}

	   Iterator<Employee> iterator=set.iterator();
		  while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
            if(employee.getId()==103){
                 set.remove(employee); //exception  concurrent modification exception. iterator.remove(); 
            }
		}
		  
		 
		  
		  System.out.println("Size :"+set.size());
		  
		  
		  
		  
		  
		  
		 
		 System.out.println(" after removing : "+set.size());
		 Set<Employee> nameTreeSet=new TreeSet<Employee>(set);
		 
	}
}
