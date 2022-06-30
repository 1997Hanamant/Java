package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment4;

public class DeepCopyCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		MusicSystem musicSytem=new MusicSystem("Bosh","Blue",10000);
		Car car=new Car("Farrari","red",1500000.00,musicSytem);
		Car copyOfCar=car.Clone();
		System.out.println(car);
		System.out.println(copyOfCar);
		copyOfCar.musicSystem.name="boat";
		System.out.println(car);
		System.out.println(copyOfCar);
		
		
	}

}



























