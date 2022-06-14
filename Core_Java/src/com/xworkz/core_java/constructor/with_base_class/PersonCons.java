package com.xworkz.core_java.constructor.with_base_class;

public class PersonCons {
	String name;
	PersonCons(){
		System.out.println("Super class Default Constructor");
	}
	PersonCons(String name){
		this.name=name;
		System.out.println("Super class Parameterzied Constructor");
	}

}
