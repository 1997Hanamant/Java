package com.xworkz.core_java.arry.arry_class;

public class Lipstick {
	String name;
	String color;
	double price;
	
	Lipstick(String name,String color,double price){
		this.name=name;
		this.color=color;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Lipstick [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	

}
