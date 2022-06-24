package com.xworkz.core_java.InstanceOfAssignment.assignment2;

public class Cafe {
	Beverage vendingmachine(int choice)
	{
		if(choice==1)
		{
			return new Coffee();
		}
		else if(choice==2)
		{
			return new Tea();
		}
		else
		{
			return null;
		}
	}
}
