package com.xworkz.jam.kissan;

public class Jam {
	public static void main(String[] args) {
		System.out.println("Jam running in main method");

		Vendor vendor=new Vendor();
		String v=vendor.getName();
		System.out.println(v);

	}

}
