package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment4;

public class MusicSystem {
	String name;
	String color;
	double price;
	
	MusicSystem(String name,String color,double price){
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "MusicSystem [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
