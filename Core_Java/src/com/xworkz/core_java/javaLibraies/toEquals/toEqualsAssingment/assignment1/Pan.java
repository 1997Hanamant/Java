package com.xworkz.core_java.javaLibraies.toEquals.toEqualsAssingment.assignment1;

public class Pan {
	String brand;
	String shape;
	double rate;
	Pan(String brand,String shape,double rate){
		this.brand=brand;
		this.shape=shape;
		this.rate=rate;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pan) {
			Pan	pan=(Pan) obj;
			if(this.brand==pan.brand) {
				if(this.shape==pan.shape) {
					if(this.rate==pan.rate) {
						return true;

					}
					return false;

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


