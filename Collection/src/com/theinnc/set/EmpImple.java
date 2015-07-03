package com.theinnc.set;

import java.util.HashSet;
import java.util.Set;

public class EmpImple {

	
	public static void main(String[] args) {
		
		Set set=new HashSet();
		set.add(new Employee(101,"abc",200.34));
		set.add(new Employee(103,"abc",200.34));
		set.add(new Employee(104,"abc",200.34));
		set.add(new Employee(102,"abc",200.34));
		set.add(new Employee(101,"abc",201.34));
		
		
		System.out.println("Size:"+set.size());
		System.out.println(set);
		
	}
}
