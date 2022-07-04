package com.xworkz.core_java.arry.arry_assignment.assignment5;

public class Copy_Arry {
	public static void main(String[] args) {
		char[] copyfrom= {'a','b','c','d','e','f','g','h','y','o'};
		char[] copyTo=new char[7];
		System.arraycopy(copyfrom, 1, copyTo, 0, 5);
		System.out.println(String.copyValueOf(copyTo));
	}

}
