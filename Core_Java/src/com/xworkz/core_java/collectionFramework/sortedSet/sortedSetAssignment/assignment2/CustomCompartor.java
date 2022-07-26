package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assignment2;

import java.util.Comparator;

public class CustomCompartor  implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		String s=o1.toString();
		String s1=o1.toString();
		
		int l=s.length();
		int l1=s1.length();
	 
		if(l<l1) {
			return -1;
		}
		else if(l>l1) {
			return +1;
		}
	  else if(l==l1) {
		  return o1.compareTo(o2);
		
	  }
	  else {
		  return 0;
	  }
		
	}

	}
	

