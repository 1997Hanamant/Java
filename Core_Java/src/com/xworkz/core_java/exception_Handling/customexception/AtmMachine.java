package com.xworkz.core_java.exception_Handling.customexception;

public class AtmMachine {
	void draw(int amount) throws AtmMachineException {
		if(amount<100 || amount>50000 || amount%100 !=0) {
			AtmMachineException atmExp=new AtmMachineException();
			throw atmExp;
			
			
		}
		else {
			System.out.println("Please collect your cash");
		}
		
	}

}
