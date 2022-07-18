package com.xworkz.core_java.exception_Handling.exceptionHandlingkeywords;

public class FinallyDemo {
	public static void main(String[] args) {
		String s="xwprkz";
		//s=null;
		int a=10;
		int b=0;
		System.out.println("main method is started");
		try {
		System.out.println(s.length());
		System.out.println(a/b);
	}
		catch(NullPointerException|ArithmeticException|ArrayIndexOutOfBoundsException e3) {
			System.out.println(e1.getMessage());
		}
		
	//	catch(NullPointerException e) {
	//System.out.println(e.getMessage());
	//	}
	//	catch(ArithmeticException e) {
	//System.out.println(e.getMessage());
	//	}
	//	catch(Exception e) {
	//		System.out.println(e.getMessage());
	//	}
	//	finally {
		//	System.out.println("Finally exceuted");
	//	}
		//System.out.println("Main method is ended");
			
		}

}
