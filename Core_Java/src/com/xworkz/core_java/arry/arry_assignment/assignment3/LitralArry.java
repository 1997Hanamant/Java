package com.xworkz.core_java.arry.arry_assignment.assignment3;

public class LitralArry {
	public static void main(String[] args) {
		//int [][] jaggedArr=new int[3][];
		//jaggedArr[0]=new int[2];
		//jaggedArr[1]=new int[3];
		//jaggedArr[2]=new int[4];
	
    	 int[][] Arr1= {{1,2},{3,4,5},{6,7,8}};
		for(int i=0;i<Arr1.length;i++) {
			for(int j=0;j<Arr1[i].length;j++) {
			System.out.print(Arr1[i][j]+" ");
		}
			System.out.println();
		
		
	}

	}
}
