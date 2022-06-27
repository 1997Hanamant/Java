package com.xworkz.core_java.javaLibraies.toEquals.toEqualsAssingment.assignment2;

public class EqualDemo {
	public static void main(String[] args) {
		Cycle cycle=new Cycle("Atlaas",2,50000.00,"Black",2);
		Cycle cycle1=new Cycle("Atlaas",2,50000.00,"Black",2);
		System.out.println(cycle.equals(cycle1));
	}

}
