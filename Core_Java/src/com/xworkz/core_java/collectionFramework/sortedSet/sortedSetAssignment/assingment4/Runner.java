package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assingment4;

import java.util.TreeSet;

public class Runner {
	public static void main(String[] args) {
		
		Student raja=new Student();
		raja.setName("Raja");
		raja.setId(10);
		
		Student rani=new Student();
		rani.setName("Rani");
		rani.setId(11);
		
		Student arjun=new Student();
		arjun.setName("Arjun");
		arjun.setId(12);
		
		TreeSet<Student> student=new TreeSet<Student>();
		student.add(raja);
		student.add(rani);
		student.add(arjun);
		System.out.println(student);
		
		
	}

}
