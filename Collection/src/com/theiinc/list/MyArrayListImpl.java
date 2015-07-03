package com.theiinc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayListImpl {
	public static void main(String[] args) {

		
		List<Integer> list=new ArrayList<Integer>();
		list.add(3403);
		list.add(34023);
		list.add(340433);
		list.add(34203);
		list.add(34103);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
        System.out.println("after sorting");
        System.out.println(list);

        
        for (Integer integer : list) {
        	System.out.println(integer);
		}

        System.out.println("iterator..");
     Iterator<Integer> iterator=   list.iterator();
     while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
	}
        
     
  ListIterator listIterator= list.listIterator();
            while (listIterator.hasPrevious()) {
				Object object = (Object) listIterator.previous();
				
			}
        
	}
}
