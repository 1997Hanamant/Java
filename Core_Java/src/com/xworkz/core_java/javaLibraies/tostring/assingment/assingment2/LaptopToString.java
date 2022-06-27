package com.xworkz.core_java.javaLibraies.tostring.assingment.assingment2;

public class LaptopToString {
	public static void main(String[] args) {
		Laptop laptop=new Laptop("HP","black",300000.00,"4GB");
		Laptop laptop1=new Laptop("Dell","white",400000.00,"8GB");
		Laptop laptop2=new Laptop("Dell","Black",380000.00,"8GB");
		Laptop[] l=new Laptop[3];
		l[0]=laptop;
		l[1]=laptop1;
		l[2]=laptop2;
		
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}
		
	}

}
