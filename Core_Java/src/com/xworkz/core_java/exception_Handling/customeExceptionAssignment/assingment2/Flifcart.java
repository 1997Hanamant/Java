package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assingment2;

public class Flifcart{
	public static void main(String[] args) throws FlifcartException {
		
		String phone="redmi";
		double price=13000.00d;
		
		if(phone.equals("redmi")) {
			if(price==12000.00d) {
				System.out.println(" I got redmi phone ");
				
			}
		else {
			try {
			FlifcartException flifExp=new FlifcartException();
			throw flifExp;
		
		}
			catch(FlifcartException e) {
				System.out.println("I did not get redmi phone");
			}
			
		
		
		
	}
	}
	}
}
