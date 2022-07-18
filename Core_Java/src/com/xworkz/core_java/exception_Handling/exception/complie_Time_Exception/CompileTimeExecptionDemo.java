package com.xworkz.core_java.exception_Handling.exception.complie_Time_Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExecptionDemo {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("E:\\Java James\\Test.txt");
			BufferedReader fb=new BufferedReader(fr);
			System.out.println( fb.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Exception is Caugth");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

