package com.xworkz.core_java.abstraction.assignment.assignment_Interface.assignment_1;

public class InterfaceDemo {
	public static void main(String[] args) {
		Atm atm=new Atm();
		BankOfBarodaCard bankOfBarodaCard=new BankOfBarodaCard();
		SyndicateCard syndicateCard=new SyndicateCard();
		atm.slot(syndicateCard);
		atm.slot(bankOfBarodaCard);
	
		
	}

}