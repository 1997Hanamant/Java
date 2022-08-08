package com.xworkz.party;

public class RunnableMain {
	public static void main(String[] args) {
		PrimeRunnable pr=new PrimeRunnable();
		pr.run();
		Thread thread=new Thread(pr);
        thread.setName("Thread-2");
		thread.start();
		String s=thread.getName();
		System.out.println(s);
		
		
	}
	

}
