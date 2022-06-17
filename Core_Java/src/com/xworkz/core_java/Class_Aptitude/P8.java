package com.xworkz.core_java.Class_Aptitude;

public class P8 {
	public static void main(String[] args) {
		int row=8;
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
		}
		for(int K=0;K<=row-1-i;K++) {
			System.out.print("*"+ " ");
			
		}
		System.out.println();
	}

}
}