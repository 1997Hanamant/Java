package com.xworkz.core_java.collectionFramework.arrayList;

public class Book {
	String brand;
	double price;
	double NoOfPages;
	
	public Book(){
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getNoOfPages() {
		return NoOfPages;
	}

	public void setNoOfPages(double noOfPages) {
		this.NoOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [brand=" + brand + ", price=" + price + ", NoOfPages=" + NoOfPages + "]";
	}
	
	

}
