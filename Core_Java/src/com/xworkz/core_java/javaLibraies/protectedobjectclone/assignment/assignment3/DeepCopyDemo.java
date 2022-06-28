package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment3;

public class DeepCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book=new Book("classmate","green",200.00);
		Book book1=new Book("classmate","green",200.00);
		Book book2=(Book)book1.Clone();
		System.out.println(book);
		System.out.println(book2);





	}
}

