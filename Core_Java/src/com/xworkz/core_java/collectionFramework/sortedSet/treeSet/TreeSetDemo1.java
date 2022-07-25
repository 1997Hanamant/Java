package com.xworkz.core_java.collectionFramework.sortedSet.treeSet;

import java.util.TreeSet;

public class TreeSetDemo1 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet(new MyComparator());
	ts.add(new StringBuffer("1"));
	ts.add(new StringBuffer("2"));
	ts.add(new StringBuffer("3"));
	ts.add(new StringBuffer("5"));
	ts.add(new StringBuffer("4"));
	System.out.println(ts); 
	
	
}
}
