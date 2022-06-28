package com.xworkz.core_java.javaLibraies.toEquals.toEquals_Class;

import java.util.Objects;

public class Ac {
	String brand;
	String color;
	double price;

	Ac(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=price;

	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, color, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ac) {
			Ac ac=(Ac)obj;
			if(this.brand==ac.brand) {
				if(this.color==ac.color) {
					if(this.price==ac.price) {
						return true;
					}

					else {
						return false;
					}

				}
				else {
					return false;
				}
			}
			else {
				return false;
			}


		}
		return false;
}
}