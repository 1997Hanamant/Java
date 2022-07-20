package com.xworkz.core_java.collectionFramework.linkedList;

public class Ac {
	String brand;
	String color;
	double price;
	
	
	public Ac(){
		
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getBrnad() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String color() {
		return color;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "AC details: "+"Brand: "+brand+"Color: "+color+"Price: "+price;
	}
	
	}
