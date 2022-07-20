package com.xworkz.core_java.collectionFramework.dtoDaoService.dto;

public class BikeDto {
	String brand;
	String color;
	double price;
	int NoOfGear;
	
	public BikeDto() {
		
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
	public int getNoOfGear() {
		return NoOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		NoOfGear = noOfGear;
	}
	@Override
	public String toString() {
		return "BikeDto [brand=" + brand + ", color=" + color + ", price=" + price + ", NoOfGear=" + NoOfGear + "]";
	}
	

}
