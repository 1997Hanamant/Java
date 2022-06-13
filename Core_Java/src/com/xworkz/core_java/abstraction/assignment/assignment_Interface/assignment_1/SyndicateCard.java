package com.xworkz.core_java.abstraction.assignment.assignment_Interface.assignment_1;

public class SyndicateCard implements WithDrawable {

	@Override
	public void withDraw() {
		System.out.println("With Drawing Cash by Syndicate Bank Atm card");
		
	}

	@Override
	public void credit() {
		System.out.println("Crediting cash to Syndicate Bank");
		
	}

}
