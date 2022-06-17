package com.xworkz.core_java.Class_Aptitude;

public class P10 {
	public static void main(String[] args) {
		int row=6;
		for(int i=row;i>=1;i--) {
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				if(k==1||i==row||k==(2*i-1)) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	

}
