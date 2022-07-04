package com.xworkz.core_java.arry.arry_assignment.assignment3;

public class Litral_Arry1 {
	public static void main(String[] args) {
		int[][] data={ {10,20},{30,40 ,50},{60,70,80,90}};
		for(int i=data.length-1;i>=0;i--) {
			for(int j=data[i].length-1;j>=0;j--) {
				System.out.print(data[i][j]+" ");
		}
			System.out.println();
	}

}
}