package com.xworkz.core_java.javaLibraies.finalizeMethodAssignment;

public class Wire {
	String brand;
	String color;
	
	Wire(String brand,String color){
		this.brand=brand;
		this.color=color;
		
	}
	@Override
	protected void finalize() {
		System.out.println("Calling finalize Method");
	}
	
public String toString() {
	return "brand: "+brand+" "+"color: "+color;
}
}
