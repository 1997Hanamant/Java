package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assingment5;

import java.util.Comparator;

public class SortedAnimalByName implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getName().compareTo(a2.getName());
	}

}
