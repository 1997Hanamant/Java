package com.xworkz.core_java.constructor.constructor_chianing.Assingment.with_base_class_Assingment;

public class Derived extends Base{
	Derived(){
		System.out.println("No-argument constructor"+"of derived");
	}
	Derived(String name){
		super(name);
		System.out.println("Calling parameterzied"+"constructor of dervied");
	}

}
