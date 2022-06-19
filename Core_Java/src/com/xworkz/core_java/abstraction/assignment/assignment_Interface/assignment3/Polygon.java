package com.xworkz.core_java.abstraction.assignment.assignment_Interface.assignment3;

public interface Polygon {
	void Area();
	default void side() {
		System.out.println("I can get Side of polygon");
	}


}
