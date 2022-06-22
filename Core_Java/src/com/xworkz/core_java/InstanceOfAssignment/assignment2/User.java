package com.xworkz.core_java.InstanceOfAssignment.assignment2;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Cafe c=new Cafe();
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter choice");
		int Choice=Scan.nextInt();
	Beverage obj=c.vendingmachine(Choice);
	if(obj instanceof Coffee) {
		System.out.println("Drinking coffee");
	}
	else if(obj instanceof Tea) {
		System.out.println("Drinking Tea");
	}
	else {
		System.out.println("Invaild");
	}
	}
	

}
