package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment4;

public class Car implements Cloneable {
	String name;
	String color;
	double price;
	MusicSystem musicSystem;

public	Car(String name,String color,double price, MusicSystem musicSystem){
		this.name=name;
		this.color=color;
		this.price=price;
		this.musicSystem=musicSystem;

	}
	public Car Clone() throws CloneNotSupportedException {
		Object obj	=super.clone();
		Car car=(Car)obj;
		car.musicSystem=new MusicSystem("Bosh","balck",120000.00);
		return car;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", musicSystem=" + musicSystem + "]";
	}
	
	
		
	}


