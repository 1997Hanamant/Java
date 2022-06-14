package com.xworkz.core_java.constructor.with_base_class;

public class EmployeeCons extends PersonCons {
	int id;
	EmployeeCons(){
		super();
		System.out.println("subclass Default Constructor");
	}
	EmployeeCons(String name,int id){
		super(name);
		this.id=id;
		System.out.println("Sub class parameterzied Constructor");
	}
	void display() {
		System.out.println("name:"+" "+name+" "+"id:"+id);
	}
	

}
