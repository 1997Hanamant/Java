package com.xworkz.core_java.InstanceOfAssignment.assignment4;

public class User {
	public static void main(String[] args) {
		Filfcart filfcart=new Filfcart();
	Eletronics	obj=filfcart.order(2);
	if(obj instanceof Mobile) {
		System.out.println("Mobile is order");
	}
	else if(obj instanceof Laptop) {
		System.out.println("Laptop is order");
		
	}
	else if(obj instanceof Tv) {
		System.out.println("Tv is order");
	}
	else {
		System.out.println("Invlaid information");
	}
	}

}
