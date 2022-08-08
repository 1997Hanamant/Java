package com.xworkz.party;

public class PrimeThread extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(100);
				System.out.println("Current Thread:"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread is running");
	}
	

}
