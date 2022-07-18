package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1;

public class EngineerDto {
	private String name;
	private int age;
	
	public EngineerDto(String name,int age) {
		this.name=name;
		this.age=age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EngineerDto [name=" + name + ", age=" + age + "]";
	}
	
	

}
