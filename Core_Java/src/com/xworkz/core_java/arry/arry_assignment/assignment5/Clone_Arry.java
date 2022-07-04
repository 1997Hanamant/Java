package com.xworkz.core_java.arry.arry_assignment.assignment5;

public class Clone_Arry {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("printing original value");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("Cloning orignal vaule");
		int carr[]=arr.clone();
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
