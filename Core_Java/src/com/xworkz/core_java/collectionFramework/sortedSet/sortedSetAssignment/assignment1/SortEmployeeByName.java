package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assignment1;

import java.util.Comparator;

public class SortEmployeeByName  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}
