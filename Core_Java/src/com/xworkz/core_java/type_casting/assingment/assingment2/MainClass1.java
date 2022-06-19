package com.xworkz.core_java.type_casting.assingment.assingment2;

public class MainClass1 {
	public static void main(String[] args) {
		Vechile vechile=new Car();
		Car car=(Car)vechile;
		car.speed();
		car.stop();
	}

}
