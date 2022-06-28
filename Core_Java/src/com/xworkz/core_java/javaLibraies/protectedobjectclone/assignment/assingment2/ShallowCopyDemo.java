package com.xworkz.core_java.javaLibraies.protectedobjectclone.assignment.assingment2;

public class ShallowCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		DoorWood wood=new DoorWood("Teak","Square",20000.00,"yellow");
		DoorWood wood1=(DoorWood)wood.clone();
		wood1.price=123.00;
		System.out.println(wood);
		System.out.println(wood1);
		
	}

}

