
package com.xworkz.java;
import java.util.Scanner;

public class ReverseNumberUsingifelse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to be reverse");
		int num=scan.nextInt();
		if(num<10) {
			System.out.println(num);
		}
		else {
			System.out.print(num%10);
			System.out.print(num/10);
			
		}
		
		
		
	}

}
