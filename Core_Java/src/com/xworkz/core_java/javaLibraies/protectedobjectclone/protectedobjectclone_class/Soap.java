package com.xworkz.core_java.javaLibraies.protectedobjectclone.protectedobjectclone_class;

public class Soap implements Cloneable {
	String brand;
	String color;
	double price;

	Soap(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;

	}
	public Soap clone() throws CloneNotSupportedException {
		Object obj=super.clone();
		Soap soap=(Soap) obj;
		return soap;
	}
	@Override
	public String toString() {
		return "brand: "+brand+"color: "+color+"price: "+price;
	}
}


