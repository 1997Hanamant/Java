package com.xworkz.core_java.javaLibraies.toEquals.toEqualsAssingment.assignment2;

public class Cycle {
	String brand;
	int noOfWheels;
	double price;
	String color;
	int noOfSheets;
	
	Cycle(String brand,int noOfWheels,double price,String color,int noOfSheets){
		this.brand=brand;
		this.noOfWheels=noOfWheels;
		this.price=price;
		this.color=color;
		this.noOfSheets=noOfSheets;
		
		
	}
	public boolean equals(Object obj) {
Cycle cycle=(Cycle)obj;
return this.brand==cycle.brand && this.color==cycle.color && this.noOfWheels==cycle.noOfWheels && this.noOfSheets==this.noOfSheets;
	}

}