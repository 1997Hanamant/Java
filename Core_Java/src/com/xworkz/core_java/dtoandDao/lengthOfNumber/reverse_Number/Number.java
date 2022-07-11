package com.xworkz.core_java.dtoandDao.reverse_Number;

public class Number{
	public static void main(String[] args) {
		int number=1234567890; 
		int reverse = 0;
		
		while(number!=0) {
		int	remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		
		}
		System.out.print(reverse+" ");
	}

}
