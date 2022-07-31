package com.xworkz.core_java.collectionFramework.mapping.customMapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomMapping {
	public static void main(String[] args) {
		Manager basu=new Manager();
		basu.setmId("1a");
		basu.setName("Basu");
		basu.setCompany("TCS");
		
		Manager manu=new Manager();
		manu.setmId("1b");
		manu.setName("Manu");
		manu.setCompany("TCS");
		
		Employee raja=new Employee();
		raja.setEmpId("2b");
		raja.setName("Raja");
		raja.setCompanyName("TCS");
		
		Employee akasha =new Employee();
		akasha.setEmpId("3b");
 	    akasha.setName("Akasha");
		akasha.setCompanyName("TCS");
		
		Employee priya=new Employee();
		priya.setEmpId("4b");
		priya.setName("Priya");
		priya.setCompanyName("TCS");
		
		Employee anu =new Employee();
		anu.setEmpId("5b");
 	    anu.setName("Manu");
		anu.setCompanyName("TCS");
		
		Set<Employee> employeeSet1=new HashSet<Employee>();
		employeeSet1.add(raja);
		employeeSet1.add(akasha);
		
		Set<Employee>employeeSet2=new HashSet<Employee>();
		employeeSet2.add(priya);
		employeeSet1.add(anu);
		
		Map<Manager, Set<Employee>> mapofManager=new HashMap<Manager, Set<Employee>>();
		mapofManager.put(manu, employeeSet1);
		mapofManager.put(basu, employeeSet2);
		System.out.println(mapofManager);
		
		for(Map.Entry<Manager, Set<Employee>> map:mapofManager.entrySet())	{
			if(map.getKey().equals(manu)) {
			Set<Employee> employees=map.getValue();
			for(Employee emp:employees) {
				if(emp.getEmpId().equals("5b"));	
				System.out.println(emp);
			}
				
			}
		}
		
	}

}

