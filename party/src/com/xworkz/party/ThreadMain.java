package com.xworkz.party;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		PrimeThread pt=new PrimeThread();
		PrimeThread pt1=new PrimeThread();
		//pt.sleep(1000);
		pt.getPriority();
		pt1.run();
		pt.setName("Thread-1");
		//pt.sleep(10000);
		String s=pt.getName();
		System.out.println(s);
		PrimeThread pt2=new PrimeThread();
		pt2.run();
		System.out.println(s);
     System.out.println(  pt2.toString());
   
	}
	

}
