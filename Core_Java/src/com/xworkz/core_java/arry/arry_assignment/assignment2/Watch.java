package com.xworkz.core_java.arry.arry_assignment.assignment2;

public class Watch {
	String brand;
	String color;
	double price;
	
	Watch(String barnd,String color,double price){
		this.brand=barnd;
		this.color=color;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "brand:"+brand+"color: " +color+"price: "+price;
		
	}

}
