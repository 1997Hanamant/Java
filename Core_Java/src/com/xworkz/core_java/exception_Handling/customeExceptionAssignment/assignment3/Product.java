package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment3;

public class Product {
private	String productName;
private double price;

Product(String productName,double price){
	this.productName=productName;
	this.price=price;
	
}
public void setProduct(String productName) {
	this.productName=productName;
}
public String getProdut() {
return productName;

}
public void setprice(double price) {
	this.price=price;
}
public double getsetprice() {
	return price;
}
@Override
public String toString() {
	return "Product [product=" + productName + ", price=" + price + "]";
}

}



