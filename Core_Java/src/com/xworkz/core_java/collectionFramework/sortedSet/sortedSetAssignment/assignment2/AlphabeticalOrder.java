package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assignment2;

import java.util.TreeSet;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new CustomCompartor());
		ts.add("Java");
		ts.add("Walk");
		ts.add("Run");
		ts.add("Speed");
		System.out.println(ts);
		
		
		
		
		
		
	}

}
