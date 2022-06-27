package com.xworkz.core_java.javaLibraies.toEquals.toEqualsAssingment.assignment1;

public class EqualsDemo {
	public static void main(String[] args) {
		Pan pan=new Pan("Crfton","Circle",5000.00);
		Pan pan1=new Pan("Crfton","Circle",5000.00);
		System.out.println(pan.equals(pan1));
	}

}
