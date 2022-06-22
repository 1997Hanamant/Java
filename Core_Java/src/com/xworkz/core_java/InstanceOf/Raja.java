package com.xworkz.core_java.InstanceOf;

public class Raja   {
	void mouth(Sweet sweet) {
		if(sweet instanceof Champakali) {
			System.out.println("Wow....is it Champakali");
		}
		else if(sweet instanceof Jilebi) {
			System.out.println("Wow..... is it Jilebi");
		}
		else {
			System.out.println(" I didn't get any Sweet");
		}
	}

}
