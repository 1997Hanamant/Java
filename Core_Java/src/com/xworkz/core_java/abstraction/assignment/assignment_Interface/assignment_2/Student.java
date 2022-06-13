package com.xworkz.core_java.abstraction.assignment.assignment_Interface.assignment_2;

public class Student implements Trainer1,Trainer2 {

	@Override
	public void presentation() {
		System.out.println("Tariner 2 giving presentation topic for student");
		
	}

	@Override
	public void train() {
		System.out.println("Tariner 1 giving tarin on Java ");
		
	}


}