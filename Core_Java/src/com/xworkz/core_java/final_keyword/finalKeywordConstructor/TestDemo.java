package com.xworkz.core_java.final_keyword.finalKeywordConstructor;

public class TestDemo {
	public static void main(String[] args) {
		Test test=new Test();
		Test test1=new Test(10);
		System.out.println("A:"+test.A);
		System.out.println("X:"+test1.x);
	}

}
