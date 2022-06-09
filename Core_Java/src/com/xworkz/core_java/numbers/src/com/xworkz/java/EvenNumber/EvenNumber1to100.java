package com.xworkz.java.EvenNumber;

public class EvenNumber1to100 {
	public static void main(String[] args) {
		int number=100;
		System.out.println("List of even number from 1:"+number+":");
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
