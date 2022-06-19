package com.xworkz.core_java.block.IIB;

public class Television {
	String brand;
	double price;
	String type;
	String dimension;
	
	Television(){
		System.out.println("calling Constructor");
	}
	{
		System.out.println("calling 1st IIB");
		this.brand="TCl";
		this.price=100000;
		this.dimension="32 inch";
		this.type="LED";
		
	}
	{
		System.out.println("calling 2nd IIB");
		this.brand="Sony";
		this.price=150000;
		this.type="LED lite";
		this.dimension="25";
	}
	
	

}
