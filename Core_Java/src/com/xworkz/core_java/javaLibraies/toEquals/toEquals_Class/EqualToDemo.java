package com.xworkz.core_java.javaLibraies.toEquals.toEquals_Class;

public class EqualToDemo {
	public static void main(String[] args) {
		Ac lg=new Ac("LG","White",3000000.00);
		Ac samsung=new Ac("LG","White",3000000.00);
		System.out.println(lg==samsung);
		System.out.println(lg.equals(samsung));
		System.out.println(samsung.equals(lg));


	}


}
