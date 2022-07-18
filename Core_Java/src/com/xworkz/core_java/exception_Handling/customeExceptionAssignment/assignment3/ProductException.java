package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment3;

public class ProductException extends RuntimeException {
	@Override
	public String toString() {
		return "Product not found";
	}

}

