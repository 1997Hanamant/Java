package com.xworkz.core_java.InstanceOfAssignment.assignment3;

public class Hotel {
	Food foodorder(int Choice){
		if(Choice==1)
		{
			Idly i=new Idly();
			return i;
		}
		else if(Choice==2)
		{
			Dosa d=new Dosa();
			return d;
		}
		else if(Choice==3) {
			Vada v=new Vada();
			return v;
		}
		else 
		{
			return null;
		}
	}

}
