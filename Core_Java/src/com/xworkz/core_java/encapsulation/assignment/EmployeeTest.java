package com.xworkz.core_java.encapsulation.assignment;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("Kumar");
		emp.setcolor("White");
		emp.setage(30);
		emp.setdesigantion("Software Engineer");
		emp.setSalary(3000000.00);
		System.out.println("name:"+emp.getname());
		System.out.println("color:"+emp.getcolor());
		System.out.println("age:"+emp.getage());
		System.out.println("desigantion:"+emp.designation());
	    System.out.println("Salary:"+emp.Salary());
	}

}
