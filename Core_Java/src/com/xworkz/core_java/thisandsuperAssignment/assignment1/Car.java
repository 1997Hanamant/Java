package com.xworkz.core_java.thisandsuperAssignment.assignment1;

public class Car extends Vechile {
	String name;
	double price;
	String color;
	String model;

	void Speed() {
		System.out.println(" Shfit will have speed of 120kmph");
	}

	Car(String name,double price,String color,String model){
		super(name,100000.00,"red");
		this.name="Shift";
		this.price=1500000.00;
		this.color="blue";
		this.model="123";
		System.out.println(name);
		System.out.println("Car details.....");
		System.out.println("brand:"+this.name);
		System.out.println("price:"+this.price);
		System.out.println("color:"+this.color);
		System.out.println("Fuction");
		this.Speed();
		System.out.println("Vechile details.......");
		System.out.println("name:"+super.brand);
		System.out.println("price:"+super.price);
		System.out.println("color:"+super.color);
	}
}