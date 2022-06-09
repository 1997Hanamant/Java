package com.xworkz.java;

public class ReverseNumberUsingForLoop {
	public static void main(String[] args) {
		int reverse=0;
		for(int number=9875;number!=0;number=number/10) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
		}
		System.out.println("The reverse of the number:"+reverse);
	}

}
