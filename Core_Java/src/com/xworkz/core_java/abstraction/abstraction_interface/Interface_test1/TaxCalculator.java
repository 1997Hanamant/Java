package com.xworkz.core_java.abstraction.abstraction_interface.Interface_test1;

public class TaxCalculator implements StateTax{

	public void PetrolTax() {
		System.out.println("State tax on petrol is 5%");
		
	}

	@Override
	public void pertoltax() {
		System.out.println("Centarl tax on petrol is 10%");
		
	}

}
