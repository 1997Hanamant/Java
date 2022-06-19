package com.xworkz.core_java.block.assingment.assingment4;

public class Class1 {
	static int i;
	int j;
	static {
		i=10;
		System.out.println("static block is called");
		
	}
	Class1(int j){
		System.out.println("Calling a Constructor");
	}

}
