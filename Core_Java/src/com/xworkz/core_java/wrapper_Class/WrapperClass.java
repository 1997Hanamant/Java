package com.xworkz.core_java.wrapper_Class;

public class WrapperClass {
	public static void main(String[] args) {
		// implicit boxing

		int a=10;
		Integer b=a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		//expelict boxing
		int c=20;
		Integer d=new Integer(c);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		
		//implicit unboxing
		Integer e=new Integer(50);
		int f=e;
		System.out.println("e:"+e);
		System.out.println("f:"+f);
	
	//Explicit unboxing
		Integer g= new Integer(100);
		int h=g.intValue();
		System.out.println("g:"+g);
		System.out.println("h:"+h);
		
	}
}
