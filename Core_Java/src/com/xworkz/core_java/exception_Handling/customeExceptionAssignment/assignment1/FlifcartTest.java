package com.xworkz.core_java.exception_Handling.customeExceptionAssignment.assignment1;

public class FlifcartTest {
	public static void main(String[] args) {
		String phone="redmiA4";
		Flifcart fc=new Flifcart();
		try {
			fc.eletronics(phone);
		} catch (FlifcartException e) {
			if(phone=="redmi") {
			System.out.println(e);
			}
	
			else {
				System.out.println(e.getMessage());
			}

}
}
}
