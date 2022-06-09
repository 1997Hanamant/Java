package com.xworkz.core_java.constructor.constructor_chianing.with_base_class;

public class TataMotors extends TataGroups {
	String model;
	String color;
	double price;
	
	TataMotors(){
		super("Nirajan");
		System.out.println("Tata Motors Constructed");
		this.color="red";
		this.model="nexon";
		this.price=1200000.45d;
	}

}
