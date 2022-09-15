package com.xworkz.core_java.string_Class;
public class String_Constructors {
	public static void main(String[] args) {
		String s="Software Developer";
		String s1="software Developer";
		//String s=new String();
		//System.out.println(s);
		//String s1=new String("Dinga");
		//System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("Soft"));
		System.out.println(s.startsWith("soft"));
		System.out.println(s.endsWith("er"));
		System.out.println(s.endsWith("eloper"));
		System.out.println(s.contains("dev"));
		System.out.println(s.contains("Dev"));
		System.out.println(s.concat(" in TY"));
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("t"));
		System.out.println(s.substring(3));
		System.out.println(s.subSequence(3, 10));
		System.out.println(s.contentEquals(s));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println("---------------------------");
		System.out.println(s.intern()==s1.intern());
		System.out.println(s.isEmpty());
		System.out.println(s.matches(s1));
		System.out.println(s.lastIndexOf(s1));
		System.out.println("__________________________");
		System.out.println(s.replaceFirst(s, s1));
		System.out.println(s.replace(s, s1));
		System.out.println(s.toUpperCase());
		System.out.println("****************");
		System.out.println(s.trim().length();
		System.out.println(s.split(s1));
		System.out.println(s.split(s, 0));
		System.out.println(s.valueOf(3));
		System.out.println(s.join(s1,"hanamant"));
	}

}
