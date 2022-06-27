package com.xworkz.core_java.javaLibraies.tostring.assingment.assingment2;

public class Laptop {
	String brand;
	String color;
	double price;
	String ramSize;
	
	Laptop(String brand,String color,double price,String ramSize){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.ramSize=ramSize;
		
	}
	public String toString() {
		return "brand: "+" "+brand+" "+"color: "+" "+color+" "+"price: "+" "+price+" "+"ramSize: "+" "+ramSize;
	}

}
