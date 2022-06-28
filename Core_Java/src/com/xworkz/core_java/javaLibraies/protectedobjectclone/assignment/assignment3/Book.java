package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment3;

public class Book  implements Cloneable{
String name;
String color;
double noOfPages;
Book(String name,String color,double noOfPages){
	this.name=name;
	this.color=color;
	this.noOfPages=noOfPages;
}
protected Object Clone() throws CloneNotSupportedException {
	return super.clone();
}
public String toString() {
	return "name: "+name+"color: "+color+"noOfPages: "+noOfPages;
}

}
