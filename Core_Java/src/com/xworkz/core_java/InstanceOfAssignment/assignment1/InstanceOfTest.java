package com.xworkz.core_java.InstanceOfAssignment.assignment1;

public class InstanceOfTest {
	public static void main(String[] args)
	{
		//Car c=new Car();//Specialzation
		//Bike b=new Bike();//Specialzation
		
		Vechile obj=new Car();//Genralization
		if(obj instanceof Car)
		{
			Car car=(Car)obj;
			System.out.println("Car brand:"+car.brand+" "+"Car fule:"+car.fule);
		}
		else if(obj instanceof Bike)
		{
			Bike bike=(Bike)obj;
			System.out.println("Bike brand:"+bike.brand+" "+"Bike Cost:"+bike.cost);
		}
	}

}
