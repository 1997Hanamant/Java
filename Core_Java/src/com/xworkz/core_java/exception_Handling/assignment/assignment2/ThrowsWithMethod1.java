package com.xworkz.core_java.exception_Handling.assignment.assignment2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsWithMethod1 {
	void readData() throws FileNotFoundException{
		FileReader fr=new FileReader("E:\\Java James\\Test.txt");
		
		System.out.println("Reading");
	}
	public static void main(String[] args) {
		ThrowsWithMethod1 m=new ThrowsWithMethod1();
		try {
			m.readData();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
