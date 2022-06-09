package com.xworkz.core_java.constructor.constructor_chianing.Assingment.with_base_class_Assingment;

public class Base {
	String name;
	Base(){
		this(" ");
		System.out.println("No-argument constructor of"+"base class");
	}
	Base(String name){
		this.name=name;
		System.out.println("Calling Parameterzied constructor"+"of base");
	}
	

}
