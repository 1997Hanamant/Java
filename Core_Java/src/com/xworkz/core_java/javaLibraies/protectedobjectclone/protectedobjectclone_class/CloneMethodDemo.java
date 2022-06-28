package com.xworkz.core_java.javaLibraies.protectedobjectclone.protectedobjectclone_class;

public class CloneMethodDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Soap soap=new Soap("lux","white",15.00);
		 Soap copyOfSoap = null;
		 copyOfSoap=soap.clone();
		 
		System.out.println(soap==copyOfSoap);
		System.out.println(soap);
		System.out.println(copyOfSoap);

	}
}

