package com.xworkz.core_java.collectionFramework.Collection;
import java.util.ArrayList;

public class ArryListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Java");
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.contains("Java"));
		System.out.println(al.contains("java"));
		System.out.println(al);
		System.out.println(al.remove(2));
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println("********************************");
		ArrayList l=new ArrayList();
		l.add(50);
		l.add(200);
		l.add(100);
		l.add(200);
	    l.add(300);
	    l.add(200);
	  
	    System.out.println(l.indexOf(100));
	    System.out.println(l.indexOf(200));
	    System.out.println(l.lastIndexOf(200));
	    System.out.println("***********************************");
	    
	    ArrayList<Integer> all=new ArrayList<Integer>();
	    all.add(2500);
	    System.out.println(all.containsAll(l));
	    
		
		
	}

}
