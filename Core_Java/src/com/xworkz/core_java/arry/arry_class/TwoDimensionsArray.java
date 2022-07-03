package com.xworkz.core_java.arry.arry_class;
public class TwoDimensionsArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		int num=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {

				arr[i][j]=num;
				num++;
				num++;

			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();


		}
	}
}


