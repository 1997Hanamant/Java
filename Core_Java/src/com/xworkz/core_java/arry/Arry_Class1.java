package com.xworkz.core_java.arry;

public class Arry_Class1 {
	public static void main(String[] args) {
		int arr[]=new int[50];
		//arr[0]=1;
		//arr[1]=2;
		//arr[2]=3;
		//arr[3]=4;
		int num=1;
		for(int i=0;i<arr.length;i++) {
			 arr[i]=num;
			num++;
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			
		}
	}

}
