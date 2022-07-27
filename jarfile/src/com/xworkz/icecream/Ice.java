package com.xworkz.icecream;

public class Ice {
	public static void main(String[] args) {
		System.out.println("Calling ice inside a main method");
		
       Shop shop=new Shop();
       String iceCream =shop.getBrandName();
       System.out.println("IceCream barndName is :"+iceCream);
		
	}

}
