package com.xworkz.core_java.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String , String> cityAndPin=new HashMap<String, String>();
		cityAndPin.put("Badami","567212" );
		cityAndPin.put("Kerur","567215" );
		cityAndPin.put("Hubli","567208");
		cityAndPin.put("Arliaktti","567209");
		
		System.out.println(cityAndPin);
		System.out.println(cityAndPin.get("Arliaktti"));
		for(Map.Entry<String , String> entry:cityAndPin.entrySet()) {
			if(entry.getKey().equals("Kerur")|| entry.getKey().equals("Badami")) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		}
		}
		}

}

