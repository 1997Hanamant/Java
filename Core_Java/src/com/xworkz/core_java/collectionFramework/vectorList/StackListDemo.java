package com.xworkz.core_java.collectionFramework.vectorList;

import java.util.Iterator;
import java.util.Stack;

public class StackListDemo {
	public static void main(String[] args) {
		Laptop hp=new Laptop();
		hp.setBrand("HP");
		hp.setColor("Black");
		hp.setPrice(35000.00);
		hp.setRamSize("4GB");
		hp.setProcesser("i3");
		
		Laptop dell=new Laptop();
		dell.setBrand("Dell");
		dell.setColor("White");
		dell.setPrice(70000.00);
		dell.setRamSize("8GB");
		dell.setProcesser("i5");
		
		Stack<Laptop> laptop=new Stack<Laptop>();
		laptop.push(hp);
		laptop.push(dell);
		//System.out.println(laptop);
		
	for(Laptop l:laptop) {
		System.out.println(l);
		
	}
Iterator<Laptop> itr=laptop.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.hasNext());
		
	}
	
	
	
	
}

}