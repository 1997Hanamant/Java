package com.xworkz.core_java.encapsulation.encapsulation_class;

import java.util.Scanner;

public class DogTest {
	public static void main(String[] args) {
		Dog dog =new Dog();
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a name");
		String name=scan.nextLine();
		//dog.setName("Rocky");
		dog.setbreed("German Shepherd");
		dog.setcolor("Black");
		dog.setage(200);
		dog.setprice(15000.00);
		System.out.println("name:"+dog.getName());
		System.out.println("breed:"+dog.getbreed());
		System.out.println("color:"+dog.getcolor());
		System.out.println("age:"+dog.getage());
		System.out.println("double:"+dog.getprice());
	}



}
