package com.xworkz.core_java.dtoandDao.lengthOfNumber;

public class Long_Number1 {
	public static void  main(String[] args) {
		int length=0;
		long temp=1;
		while(temp<=12345678909l) {
			length++;
			temp*=10;
			
		}
		System.out.println(length);
	}

}
