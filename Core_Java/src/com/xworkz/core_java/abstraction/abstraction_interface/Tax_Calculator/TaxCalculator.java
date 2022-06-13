package com.xworkz.core_java.abstraction.abstraction_interface.Tax_Calculator;

public class TaxCalculator implements StateTax,CentralTax {

	@Override
	public void eletricityTax() {
		System.out.println("eletricity tax is 5%");
		
	}
public void petrolTax() {
	System.out.println("petrol tax is 18%");
	
}
@Override
public void petrolTax1() {
	System.out.println("petrol tax 35%");
	
}

}
