package com.xworkz.core_java.type_casting.Non_primitive_type_casting;

public class Mainclass {
	public static void main(String[] args) {
		Bird bird=new Peaccock();
		Peaccock peaccock=(Peaccock)bird;
		peaccock.dance();
		peaccock.fly();


	}

} 
