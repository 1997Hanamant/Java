package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assingment2;

public class DoorWood implements Cloneable {
	String name;
	String shape;
	double price;
	String color;
	DoorWood(String name,String shape,double price,String color){
		this.name=name;
		this.shape=shape;
		this.price=price;
		this.color=color;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		return "name: "+name+" "+"shape: "+shape+" "+"price: "+price+" "+"color: "+color;
	}

}
