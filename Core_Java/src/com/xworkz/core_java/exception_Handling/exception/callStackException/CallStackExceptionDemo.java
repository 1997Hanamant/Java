package com.xworkz.core_java.exception_Handling.exception.callStackException;

public class CallStackExceptionDemo {
	static	int divide(int a,int b) {
		return  a/b;
	}
	static	int computeDivision(int a,int b) {
		return divide (a,b);
	}
	public static void main(String[] args) {
		try {
			int result=computeDivision(20,0);
			System.out.println("result:"+result);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("ended");
	}

}
