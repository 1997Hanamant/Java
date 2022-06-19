
package com.xworkz.core_java.abstraction.abstraction_interface.Interface_test;

public class InterfaceDemo {
	public static void main(String[] args) {
		Computer computer=new Computer();
		Sony sony=new Sony();
		Epson epson=new Epson();
		computer.slot(epson);
		computer.slot(sony);
		String temp=computer.toString();
		System.out.println(temp);
		
	}

}

