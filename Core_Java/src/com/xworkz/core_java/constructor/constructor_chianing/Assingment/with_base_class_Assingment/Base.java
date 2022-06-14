package com.xworkz.core_java.constructor.constructor_chianing.Assingment.with_base_class_Assingment;

public class Base {
	String name;
	Base(String name){
		this();
		this.name=name;

		System.out.println("No-argument constructor of"+"base class");
	}
	Base(){
		System.out.println("Calling Parameterzied constructor"+"of base");
	}
	

}
