package com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dto;


public class EmplyoeeDto {
	private String name;
	private int age;
	private String desigantion;
	
	public EmplyoeeDto() {
	}
	
	public EmplyoeeDto(String name, int age,String desigantion) {
		this.name=name;
		this.age=age;
		this.desigantion=desigantion;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name)  {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}

	@Override
	public String toString() {
		return "EmplyoeeDto [name=" + name + ", age=" + age + ", desigantion=" + desigantion + "]";
	}
	
	

}
