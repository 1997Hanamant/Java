package com.xworkz.core_java.thisandsuper;

public class Idly extends Food {
	String name="Idly";
	String color="White";
	String taste="Medium";
	double price=10.00;
	
	Idly(String name,String color,String taste,double price){
		System.out.println(name);
		System.out.println("Idly Details.........");
		System.out.println("name:"+this.name);
		System.out.println("color:"+this.color);
		System.out.println("taste:"+this.taste);
		System.out.println("price:"+this.price);
		System.out.println("Food details......");
		System.out.println("Idly Details");
		System.out.println("name:"+super.name);
		System.out.println("color:"+super.color);
		System.out.println("taste:"+super.taste);
		System.out.println("price:"+super.price);
	}
			

}
