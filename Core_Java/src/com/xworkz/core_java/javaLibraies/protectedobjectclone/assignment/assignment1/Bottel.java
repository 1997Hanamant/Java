package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment1;

public class Bottel implements Cloneable{
	String brand;
	String shape;
	double price;

	Bottel(String brand,String shape,double price){
		this.brand=brand;
		this.shape=shape;
		this.price=price;
	}
	public Bottel Colne() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Bottel bottel=(Bottel)obj;
		return bottel;
	}
	public String toString() {
		return "brand: "+brand+"shape: "+shape+"price: "+price;
	}

}
