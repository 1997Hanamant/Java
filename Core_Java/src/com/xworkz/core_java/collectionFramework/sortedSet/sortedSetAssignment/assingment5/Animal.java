package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assingment5;

public class Animal {
private	String name;
private	String color;
private	int age;
	
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

}
