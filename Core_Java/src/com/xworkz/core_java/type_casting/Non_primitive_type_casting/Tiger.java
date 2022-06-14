package com.xworkz.core_java.type_casting.Non_primitive_type_casting;

public class Tiger extends Animal {
	public static void main(String[] args) {
		System.out.println("main method started");
		Animal animal=new Tiger();
		Tiger tiger=(Tiger)animal;
		
		System.out.println("main method ended");
		
	}

}
