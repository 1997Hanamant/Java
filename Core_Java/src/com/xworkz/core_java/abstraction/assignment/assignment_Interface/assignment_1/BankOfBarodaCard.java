package com.xworkz.core_java.abstraction.assignment.assignment_Interface.assignment_1;

public class BankOfBarodaCard implements WithDrawable {

	@Override
	public void withDraw() {
	   System.out.println("WithDrawing cash by Bank of Baroda Atm Card");
		
	}

	@Override
	public void credit() {
	   System.out.println("Crediting cash to Bank of Baroda");
		
	}
	

}
