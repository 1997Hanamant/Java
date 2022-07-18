package com.xworkz.core_java.exception_Handling.assignment.try_and_catch;

import java.util.Scanner;

public class TryAndCatchDemo {
	public static void main(String[] args) {
		System.out.println("started");
		Scanner Scan =new Scanner(System.in);
		System.out.println("Enter a number a:");
		int a=Scan.nextInt();
		System.out.println("Enter b number b:");
		int b=Scan.nextInt();
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e){
		e.printStackTrace();
		}
		System.out.println("ended");
		
		
	}
	

}
