package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assingment4;

import java.util.Scanner;

public class LoginFrom {
	public static void main(String[] args)throws InvalidPasswordException {
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Enter your Id");
		String id=scan.next();
		System.out.println("Enter your password");
		int password=scan.nextInt();
		
		if(id.equals("admin")) {
			if(password==123) {
				System.out.println("Your login succesfull");
			}
			else {
				try {
					
				InvalidPasswordException obj=new InvalidPasswordException();
				throw obj;
				}
				catch(InvalidPasswordException e) {
				System.out.println("Invalid password Enter");
				}
			}
		
			
		}

	}

}
