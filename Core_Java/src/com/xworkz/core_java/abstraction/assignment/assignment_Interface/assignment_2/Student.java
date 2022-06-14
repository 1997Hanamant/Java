package com.xworkz.core_java.abstraction.assignment.assignment_Interface.assignment_2;

public class Student implements Trainer1,Trainer2{

	@Override
	public void presentation() {
		System.out.println("tariner 2 given presentation");
		
	}

	@Override
	public void mock() {
		System.out.println("Trainer 1 given mock");
		
	}

	@Override
	public void train() {
		System.out.println("Tariner 1 given tarin");
		
	}

	@Override
	public void Test() {
		System.out.println("Trainer 1 test");
		
	}
		
	


}