package com.xworkz.core_java.string_Class;

public class StringTest {
	public static void main(String[] args) {
		String s=new String("vanitha");
		System.out.println(s);
		String s1=new String("vanitha");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String s2="vanitha";
		String s3="vanitha";
		String name="bhoomika";
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	    System.out.println(s2==name);
	    System.out.println(s2.equals(name));
	    
	}

}

