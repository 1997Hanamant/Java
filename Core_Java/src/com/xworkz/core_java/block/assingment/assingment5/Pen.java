package com.xworkz.core_java.block.assingment.assingment5;

public class Pen {
	String name;
	String color;
	static String needle;
	static String ink;
	
	Pen(){
		System.out.println("Calling Constructor");
		}
	{
		System.out.println("Calling 1st IIB");
		this.name="Omega";
		this.color="Blue";
	}
	{
		System.out.println("Calling 2nd IIB");
		this.name="WirteoMeter";
		this.color="Black";
	}
	static {
		System.out.println("Calling 1st SIB");
		ink="red";
		needle="aluminum";
	}
	static {
		System.out.println("Calling 2nd SIB");
		ink="yellow";
		needle="steel";
		
	}

}
