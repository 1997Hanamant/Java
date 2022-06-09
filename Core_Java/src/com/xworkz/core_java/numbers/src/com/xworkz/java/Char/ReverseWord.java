package com.xworkz.java.Char;

public class ReverseWord {
	public static void main(String[] args) {
		String name="Deepak";
		int length=name.length();
		String rev=" ";
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("Revesre of"+name+"is"+rev);
	}

}
