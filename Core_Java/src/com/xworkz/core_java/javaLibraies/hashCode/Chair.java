package com.xworkz.core_java.javaLibraies.hashCode;

public class Chair {
	@Override
	public int hashCode() {
		return 1;
	}
	public static void main(String[] args) {
		Chair chair=new Chair();
		System.out.println(chair.hashCode());

	}

}
