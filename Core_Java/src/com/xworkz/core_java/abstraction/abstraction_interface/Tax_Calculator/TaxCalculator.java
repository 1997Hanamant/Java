package com.xworkz.core_java.abstraction.abstraction_interface.Tax_Calculator;

public class TaxCalculator implements StateTax,CentralTax{

	@Override
	public void petrolTax1() {
		System.out.println("Centarl tax on petrol is 5%");
		
	}

	@Override
	public void eletricityTax() {
		System.out.println("State tax on eletricity is 8%");
		
	}

	@Override
	public void petrolTax() {
	System.out.println("State tax on petrolTax is 10%");
		
	}
	
}
