package com.xworkz.core_java.arry.arry_assignment.assignment6;

public class Matrix {
	public static void main(String[] args) {
		int a[][]= {{1,2,10},{3,4,5}};
		int b[][]= {{6,7,11},{8,9,10}};
		int c[][]=new int[2][3];
		
		for(int i=0;i<c.length;i++) {
		for (int j = 0; j < c[i].length; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			
		}
		System.out.println();
				
			}
		}
		
	}


