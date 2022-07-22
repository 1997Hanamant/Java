package com.xworkz.core_java.collectionFramework.stackDtoDaoService.dto;

import java.util.ArrayList;

public class FligthDto {
private	String name;
private	String source;
private	String destination;
private	String type;
private	double price;
private	ArrayList<String>offers;

public FligthDto() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public ArrayList<String> getOffers() {
	return offers;
}

public void setOffers(ArrayList<String> offers) {
	this.offers = offers;
}

@Override
public String toString() {
	return "FligthDto [name=" + name + ", source=" + source + ", destination=" + destination + ", type=" + type
			+ ", price=" + price + ", offers=" + offers + "]";
}




}

