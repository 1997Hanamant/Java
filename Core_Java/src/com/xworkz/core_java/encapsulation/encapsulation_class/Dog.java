package com.xworkz.core_java.encapsulation.encapsulation_class;

public class Dog {
	private String name;
	private String breed;
	private String color;
	private int age;
	private double price;

	Dog(){

	}
	public	void setName(String name) {
		this.name=name;
	}
	public void setbreed(String breed) {
		if(age<100) {
			System.out.println("Valild value");
		}
		else {
			System.out.println("Invalid value");
		}
		this.breed=breed;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void setage(int age) {
		
		this.age=age;
	}
	public void setprice(double price) {
		this.price=price;

	}
	public String getName() {
		return name;
	}
	public String getbreed() {
		return breed;	
	}
	public String  getcolor() {
		return color;	 
	}

	public int getage() {
		return age;
	}
	public double getprice() {
		return price;
	}

}