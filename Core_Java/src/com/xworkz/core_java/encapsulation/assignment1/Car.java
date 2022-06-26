package com.xworkz.core_java.encapsulation.assignment1;

public class Car {
	
	private int cost;
	public	Car(int cost){
		if(cost>0) {
			this.cost=cost;
		}
	}
	public int getcost() {
		return cost;

	}
	public void setcost(int cost) {
		if(cost>0) {
			this.cost=cost;
		}

	}


}
