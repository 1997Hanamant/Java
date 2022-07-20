package com.xworkz.core_java.collectionFramework.Collection;

import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add("Java");
		ll.add("php");
		ll.addFirst("Shadow");
		ll.addLast("Nandi");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(1));
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll.remove(1));
		ll.set(1, "Phyton");
		System.out.println(ll);
		ll.add(2, 500);
		System.out.println(ll);
				
		
		
	}
}
