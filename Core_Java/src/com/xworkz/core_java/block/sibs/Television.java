package com.xworkz.core_java.block.sibs;

public class Television {
	String brand;
	double price;
	String type;
	String Dimensions;
	static String  dthProvider;
	static String cables;
	
	Television(){
		System.out.println("calling Constructor");
		
	}
	{
		System.out.println("calling 1st IIB");
		this.brand="TCL";
		this.price=120000;
		this.type="LED";
		this.Dimensions="40inch";
	}
	
	{
		System.out.println("calling 2nd IIB");
		this.brand="Sony";
		this.price=150000;
		this.type="LED lite";
		this.Dimensions="50inch";
	}
	static {
		System.out.println(" Calling 1 st SIB");
		dthProvider="Tata Sky";
		
	}
	static{
		System.out.println("Calling 2nd SIB");
		cables="M";
	}

}
