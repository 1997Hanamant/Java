package com.xworkz.core_java.javaLibraies.toEquals.toEqualsAssingment.assignment2;

public class EqualDemo {
	public static void main(String[] args) {
		Cycle cycle=new Cycle("Atlaas",2,50000.00,"Black",2);
		Cycle cycle1=new Cycle("Atlaas",2,50000.00,"Black",2);
		System.out.println(cycle.equals(cycle1));
		System.out.println(new Cycle("Atlaas",2,50000.00,"Black",2).equals(new Cycle("Atlaas",2,50000.00,"Black",2)));
		if(cycle.equals(cycle1)) {
			System.out.println("Content are same");
		}
		else {
			System.out.println("Content are not same");
		}
	}

}
