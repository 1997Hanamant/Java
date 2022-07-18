package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment3;

public class FilpCartTest {
	public static void main(String[] args) {
		Product pedigree=new Product("Pedigree",7000.00d);
		Product lakmeCream =new Product("Lakme Cream",500.00d);
		Product soap =new Product("soap",500.00d);
		Product shampoo =new Product("shampoo",500.00d);
		Product bicycle =new Product("Bicycle",500.00d);

		FilpCart flipCart=new FilpCart();
		flipCart.addProduct(pedigree);
		flipCart.addProduct(lakmeCream);
		flipCart.addProduct(shampoo);
		flipCart.addProduct(bicycle);
		flipCart.addProduct(soap);
		try {
        Product product=flipCart.getProduct(pedigree);
		System.out.println(product);
		}
		catch(ProductException e) {
			System.out.println(e.getMessage());
		}


	}
}
