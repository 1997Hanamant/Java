package com.xworkz.core_java.InstanceOfAssignment.assignment4;

public class Filfcart {
	Eletronics	order(int Choice){
		if(Choice==1) {
			return new Mobile();
		}
		else if(Choice==2) {
			return new Laptop();
		}
		else if(Choice==3) {
			return new Tv();
		}
	else {
		return null;
	}


}
}
