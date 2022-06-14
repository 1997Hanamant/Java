package com.xworkz.core_java.type_casting;

public class ImplicitPrimitiveTypeCasting {
	public static void main(String[] args) {
		byte a=127;
		short b=a;
		System.out.println("byte a:"+a);
		System.out.println("short b:"+b);
		
		Short c=32000;
		int d=c;
		System.out.println("short c:"+c);
		System.out.println(" int d:"+d);
		
		int e=238900000;
		long f=e;
		System.out.println("int e:"+e);
		System.out.println("long f:"+f);
		
		long g=98735546388l;
		float i=g;
		System.out.println("long g:"+g);
		System.out.println("float i:"+i);
		
		float r=3.6477895967889f;
		double s=r;
		System.out.println("float r:"+r);
		System.out.println("double s:"+s);
		
		}

}
