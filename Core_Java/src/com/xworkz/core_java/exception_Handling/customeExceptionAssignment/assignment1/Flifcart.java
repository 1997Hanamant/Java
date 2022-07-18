package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment1;

public class Flifcart {
	void eletronics(String phone) throws FlifcartException  {

		if(phone.equals(phone)) {
			FlifcartException flifException=new FlifcartException();
			throw flifException;
		}
		else {
			System.out.println("I  buy a redmi phone");



		}


	}
}
