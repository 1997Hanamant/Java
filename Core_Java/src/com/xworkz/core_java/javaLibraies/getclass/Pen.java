package com.xworkz.core_java.javaLibraies.getclass;

public class Pen {
	public static void main(String[] args) {
		Object obj=new String("Java");
		Class a=obj.getClass();
		System.out.println(a.getName());
	}

}
