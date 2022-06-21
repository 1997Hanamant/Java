package com.xworkz.core_java.encapsulation.assignment1;

public class CarTest {
	public static void main(String[] args) {
		Car c=new Car(100);
		System.out.println("cost:"+c.getcost());
		c.setcost(200);
		System.out.println("cost:"+c.getcost());
		c.setcost(300);
		System.out.println("cost:"+c.getcost());
	}

}
