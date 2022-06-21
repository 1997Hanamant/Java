package com.xworkz.core_java.final_keyword.finalKeywordWithblock;

public class Finalblock {

	final int X;
	static final int Y;
	Finalblock(){
		System.out.println("Calling default Constructor");
	}
	{
		System.out.println("Calling IIB");
		this.X=20;
	}
	static {
		System.out.println("Calling SIB");
		Y=30;


	}
}
