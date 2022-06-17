package com.xworkz.core_java.Class_Aptitude;

public class P7 {
	public static void main(String[] args) {
		for(int i=0;i<=6;i++) {
			for(int j=6-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
