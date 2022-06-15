package com.xworkz.core_java.type_casting.Non_primitive_type_casting;

public class Tiger extends Animal {
	public static void main(String[] args) {
		System.out.println("main method started");
		//upCasting
		Animal animal=new Tiger();
		//downCasting
		Tiger tiger=(Tiger)animal;
		
		System.out.println("main method ended");
		
	}

}
