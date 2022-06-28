package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assignment1;

public class CloneMethodDemo {
	public static void main(String[] args) {
		Bottel bottel=new Bottel("omkar","circular",10.00);
		Bottel copyOfBottel=null;
		copyOfBottel=bottel.Colne();
		
		System.out.println(bottel);
		System.out.println(copyOfBottel);
		System.out.println(bottel==copyOfBottel);
	}

}
