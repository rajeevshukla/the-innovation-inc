package com.theinnc.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.theinnc.set.Employee;
import com.theinnc.set.SalaryComparator;

public class MapImpl {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hashMap=new LinkedHashMap<Integer,String>();
		hashMap.put(23, "asd");
		hashMap.put(25, "asd");
		hashMap.put(24, "asd");
		hashMap.put(27, "asdfasdf");


		//System.out.println(hashMap.get(24));

		Set<Integer> keySet= hashMap.keySet(); 
		Iterator<Integer> iterator=keySet.iterator();

		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Keys : "+key +" Value="+hashMap.get(key));
			/*if(key==25){
				iterator.remove();
			}*/
		}

		System.out.println("================ iterating with entry set ===========");

		Set<Map.Entry<Integer, String>> entrySet= hashMap.entrySet();
		Iterator<Map.Entry<Integer, String>> iteratorMap=	                entrySet.iterator();
		while (iteratorMap.hasNext()) {
			Map.Entry<Integer,String> entry = (Map.Entry<java.lang.Integer,java.lang.String>) iteratorMap
					.next();
			System.out.println(entry.getKey() +" :"+entry.getValue());

		}

		 TreeMap<Integer, String> treeMap=new  TreeMap(hashMap);
		 
		 
		 TreeMap<Employee, Integer> employeeMap=new TreeMap<Employee,Integer>(new SalaryComparator());
		 employeeMap.put(new Employee(104, "hello", 2323.09), 12);
		 employeeMap.put(new Employee(102, "abc", 232.04), 14);
		 employeeMap.put(new Employee(106, "abc", 2320.04), 34);
		 
		 System.out.println(employeeMap);
		
		System.out.println(hashMap);
		System.out.println(treeMap);
		
		Hashtable<String, Object> object=new Hashtable<String,Object>();
	 	 object.put(null,null);
	 	 
		

	
	}
}
