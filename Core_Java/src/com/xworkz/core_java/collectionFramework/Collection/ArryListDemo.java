package com.xworkz.core_java.collectionFramework.Collection;
import java.util.ArrayList;

public class ArryListDemo {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		al.add(120);
		al.add(130);
		al.add(140);
		al.add(150);
		al.add(160);
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
		ArrayList<Integer> l=new ArrayList<Integer>();
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
