package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment1;

public class FlifcartException extends Exception {

	@Override
	public String toString() {
		return "I not buy a redmi phone";
	}
	
	public String getmessage() {
		return "Amount is not sufficent to buy remdi phone";
	}

}
