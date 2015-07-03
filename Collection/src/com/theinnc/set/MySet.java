package com.theinnc.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {


		Set hashSet=new HashSet();
		hashSet.add(23);
		hashSet.add(8);
		hashSet.add(345);

		hashSet.add(23);
		hashSet.add(8);
		System.out.println(hashSet.add(345));
		hashSet.add(20);
		hashSet.add(8);
		hashSet.add(345);
		hashSet.add(new  String("hello"));
		hashSet.add(new  String("hello"));


		Set linkedHashSet=new LinkedHashSet();
		linkedHashSet.add(23);
		linkedHashSet.add(8);
		linkedHashSet.add(345);

		Set<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(23);
		treeSet.add(8);
		treeSet.add(345);

		Set<String> treeSetString=new TreeSet<String>();
		treeSetString.add("#abc");
		treeSetString.add("123abc");
		treeSetString.add("123#abc");
		treeSetString.add("123");
		
		treeSetString.add("abc");
        treeSetString.add("Abc");
		System.out.println("Treeset String : "+treeSetString);


		System.out.println("HashSet ## "+hashSet);


		System.out.println("LinkedHashSet ## "+ linkedHashSet);

		System.out.println("TreeSet ## "+treeSet);
	}
}
