package com.xworkz.core_java.exception_Handling.customexception;

public class AtmMachineTest {
	public static void main(String[] args) {
		int amount=55000;
		
	AtmMachine atm=new AtmMachine();
	try {
		atm.draw(amount);
	}
	catch (AtmMachineException e) {
		if(amount>50000) {
		System.out.println(e);
	}
		else {
			System.out.println(e.getMessage());
		}
	}

}
}