package com.xworkz.core_java.type_casting;

public class ExplicitPrimitiveTypeCasting {
	public static void main(String[] args) {
		double a=1.2345678789121416d;
		float b=(float) a;
		System.out.println(" double a:"+a);
		System.out.println("float f:"+b);
		
		float c=1.23456789f;
		long d=(long) c;
		
		System.out.println("float c:"+c);
		System.out.println("long d:"+d);
		
		long e=1234567890l;
		int f=(int) e;
		System.out.println("long e:"+e);
		System.out.println("int f:"+f);
		
		int g=864367299;
		short h=(short) g;
		System.out.println("int g:"+g);
		System.out.println("short h:"+h);
		
		short i=12345;
		int j=(int)i;
		System.out.println("short i:"+i);
		System.out.println("int j:"+j);
		
	}

}
