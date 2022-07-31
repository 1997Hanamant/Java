package com.xworkz.core_java.collectionFramework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(5, "Pen");
		hs.put(6, "Book");
		hs.put(7, "bag");
		hs.put(8, "Bottel");
		
       Set<Integer> s=hs.keySet();
       for(int key:s) {
    	   System.out.println(key);
    	   System.out.println("****************");
    	   
    	   LinkedHashMap<Integer, String> lhp=new LinkedHashMap<Integer, String>();
    	   lhp.put(10, "Moblie");
    	   lhp.put(20, "Tv");
    	   lhp.put(30, "Pan");
    	   lhp.put(10, "Java");
    	   System.out.println(lhp);
    	   
          Set<Integer> s1=lhp.keySet();
         for(int key1:s1) {
        	 System.out.println(key1);
        	 System.out.println("***************");
        	 
        	 
        	 TreeMap<String , Integer> tm=new TreeMap<String, Integer>();
        	 tm.put("Car", 100);
        	 tm.put("Bike",200);
        	 tm.put("Cycle", 300);
        	Set<String> s2= tm.keySet();
        	for(String key2: s2) {
        		System.out.println(key2);
        	}
         }
    	   
       }

	}

}
