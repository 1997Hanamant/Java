package com.xworkz.core_java.javaLibraies.finalizeMethod;

public class Biriyani {
	String name;
	double price;
	
	Biriyani(String name,double price){
		this.name=name;
		this.price=price;
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Calling finalize Method");
	}
	@Override
public String toString() {
	return "name: "+name+"price: "+price;
}
}

