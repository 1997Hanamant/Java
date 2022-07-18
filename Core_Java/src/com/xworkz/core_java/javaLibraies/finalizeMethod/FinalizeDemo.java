package com.xworkz.core_java.javaLibraies.finalizeMethod;

public class FinalizeDemo {
	public static void main(String[] args) throws Throwable {
	      new Biriyani("Malappa",30.00).finalize();
		//System.gc();
		//biriyani=null;
		//System.out.println(biriyani);
	}

}
