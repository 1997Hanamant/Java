package com.xworkz.java.Char.OddNumber1To100;

public class OddNumber {
	public static void main(String[] args) {
		int num=100;
		System.out.println("List off odd number from 1 to:"+num+":");
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
			System.out.print(i+" ");
		}
	}

}
}