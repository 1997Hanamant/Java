package com.xworkz.core_java.javaLibraies.tostring;

public class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Employee name"+name+" "+"is"+" "+id;
	}
	public static void main(String[] args) {
		Employee e=new Employee(101,"Kumar");
		Employee e1=new Employee(102,"Raja");
		Employee e2=new Employee(103,"Rani");
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
	}
	
	

}
