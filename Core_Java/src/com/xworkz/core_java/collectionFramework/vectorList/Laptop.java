package com.xworkz.core_java.collectionFramework.vectorList;

public class Laptop {
	String brand;
	String color;
	double price;
	String ramSize;
	String processer;
	
public 	Laptop(){
		
	}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getRamSize() {
	return ramSize;
}

public void setRamSize(String ramSize) {
	this.ramSize = ramSize;
}

public String getProcesser() {
	return processer;
}

public void setProcesser(String processer) {
	this.processer = processer;
}

@Override
public String toString() {
	return "Laptop [brand=" + brand + ", color=" + color + ", price=" + price + ", ramSize=" + ramSize + ", processer="
			+ processer + "]";
}



}
