package com.xworkz.core_java.encapsulation.assignment;

public class Employee {
	private	String name;
	private	String color;
	private	int age;
	private	String designation;
	private	double Salary;

	Employee(){

	}
	public void setName(String name) {
		this.name=name;

	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void setage(int age){
		this.age=age;	
	}
	public void setdesigantion(String designation ){
		this.designation=designation;

	}
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
	public String  getname() {
		return name;
	}
	public String getcolor(){
		return color;
	}
	public int getage() {
		return age;
	}
	public String designation() {
		return designation;
	}
	public double Salary() {
		return Salary;

	}

}
