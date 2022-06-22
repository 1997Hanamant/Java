package com.xworkz.core_java.InstanceOfAssignment.assignment3;

public class InstanceOfTest {
	public static void main(String[] args) {

		Hotel hotel=new Hotel();
		Food obj=hotel.foodorder(2);
		if(obj instanceof Idly) {
			System.out.println("Order Idly");
		}
		else if(obj instanceof Dosa)
		{
			System.out.println("Order Dosa");
		}
		else if(obj instanceof Vada) {
			System.out.println("Order Vada");

		}
		else{
			System.out.println("Invalid");
		}
	}

}
