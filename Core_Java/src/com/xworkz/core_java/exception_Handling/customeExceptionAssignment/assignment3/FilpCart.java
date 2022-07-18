package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment3;

public class FilpCart {
	Product[] products=new Product[10];
	
	void addProduct(Product product) {
		for(int i=0;i<products.length;i++) {
			if(products[i]==null) {
				products[i]=product;
				System.out.println("Product added:"+products[i]);
				break;
			}
		}
	}
	Product getProduct(Product proudct) throws ProductException {
		Product product1=null;
		for(int i=0;i<products.length;i++) {
			if(products[i]!=null&& products[i].getProdut().equals(proudct.getProdut())) {
			product1=products[i];
		}
	}
	if(product1!=null) {
		return product1;
	}
	else {
		ProductException pe=new ProductException();
		throw pe;
		
	}

}
}