package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assignment1;

public class Employee {
	String name;
	int age;
	double price;
	
	public Employee(String name,int age,double price) {
		this.name=name;
		this.age=age;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	

}
