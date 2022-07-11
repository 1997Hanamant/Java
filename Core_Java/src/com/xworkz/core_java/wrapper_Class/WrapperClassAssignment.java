package com.xworkz.core_java.wrapper_Class;

public class WrapperClassAssignment {
	public static void main(String[] args) {
		byte a=10;
		Byte b=a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		byte c=30;
		Byte d=new Byte(c);
		System.out.println("c:"+c);
		System.out.println("d:"+d);

		Byte e=new Byte ((byte) 30);
		byte f=e;
		System.out.println("e:"+e);
		System.out.println("f:"+f);

		Byte g=new Byte( (byte) 100);
		byte h=g.byteValue();
		System.out.println("g:"+g);
		System.out.println("h:"+h);

		Short m= new Short((short) 200);
		Short k=m.shortValue();
		System.out.println("m:"+m);
		System.out.println("k:"+k);

		Short i=new Short( (short) 20);
		short j=i.shortValue();
		System.out.println("i:"+i);
		System.out.println("j:"+j);

		Long l=new Long(600000000);
		long p=l.longValue();
		System.out.println("l:"+l);
		System.out.println("p:"+p);


		Boolean n=new Boolean(true);
		boolean s=n.booleanValue();
		System.out.println("n:"+n);
		System.out.println("s:"+s);


		Double x=new Double(200.20);
		Double y=x.doubleValue();
		System.out.println("x:"+x);
		System.out.println("y:"+y);

		Character z=new Character('a');
		char v=z.charValue();
		System.out.println("z:"+z);
		System.out.println("v:"+v);
	}
}
