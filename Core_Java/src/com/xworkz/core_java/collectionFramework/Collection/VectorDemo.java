package com.xworkz.core_java.collectionFramework.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Character> vector=new Vector<Character>();
		vector.addElement('A');
		vector.addElement('B');
		vector.addElement('C');
		vector.addElement('D');
		//vector.addElement("String");
		System.out.println(vector);
		System.out.println("****************");
		vector.insertElementAt('E', 1);
	    System.out.println(	vector.elementAt(1));
	    System.out.println( vector.firstElement());
	    System.out.println( vector.lastIndexOf('D'));
	    System.out.println(vector.removeElement('B'));
	    System.out.println(vector);
	    System.out.println("*******************");
	    vector.removeElementAt(1);
		System.out.println(vector);
		vector.set(1, 'U');
		System.out.println(vector);
		System.out.println("****************");
		
		int count=0;
      Enumeration<Character>enumeration	=vector.elements();
      while(enumeration.hasMoreElements()) { 
    	  enumeration.nextElement();
    	  count++;
      }
	 System.out.println("no of Elements:"+count);	
	}

}
