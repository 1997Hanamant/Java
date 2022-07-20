package com.xworkz.core_java.collectionFramework.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(40);
		ll.add(60);
		ll.add(20);

		System.out.println(ll);
		System.out.println("*****************");

		ArrayList al=new ArrayList();
		al.addAll(ll);
		al.add(100);
		System.out.println(al);
		System.out.println("*****************");
		al.removeAll(ll);
		System.out.println(al);
        System.out.println(al.contains(ll));
        System.out.println("******************");
        
        ArrayList al1=new ArrayList();
        al1.add(90);
        al1.add(80);
        al1.add(200);
        al1.add(500);
        
      //  al1.add(1, 800);
      //  System.out.println(al1);
        al1.set(1, 600);
        System.out.println(al1);
        
        Collections.sort(al1);
        System.out.println(al1);
        
        
        
       
       
       
        
        
        
       
       
        
        
		



	}

}
