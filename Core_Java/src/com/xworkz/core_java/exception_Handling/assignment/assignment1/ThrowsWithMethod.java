package com.xworkz.core_java.exception_Handling.assignment.assignment1;

public class ThrowsWithMethod {
	static void div() throws InterruptedException{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		try {
			div();
		} catch (Exception e) {
			System.out.println("Hello");
		}
		
	}

}
 