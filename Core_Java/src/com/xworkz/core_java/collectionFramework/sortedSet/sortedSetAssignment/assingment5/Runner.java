package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assingment5;

import java.util.TreeSet;

public class Runner {
	public static void main(String[] args) {
		Animal dog=new Animal();
		dog.setName("Dog");
		dog.setColor("Black");
		dog.setAge(10);
		
		Animal cat=new Animal();
		cat.setName("Cat");
		cat.setColor("White");
		cat.setAge(5);
		
		Animal rat=new Animal();
		rat.setName("Rat");
		rat.setColor("Grey");
		rat.setAge(3);
		SortedAnimalByName name=new SortedAnimalByName();
		TreeSet<Animal> animal=new TreeSet<Animal>( name);
		animal.add(dog);
		animal.add(cat);
		animal.add(rat);
		
		System.out.println(animal);
		
	}

}
