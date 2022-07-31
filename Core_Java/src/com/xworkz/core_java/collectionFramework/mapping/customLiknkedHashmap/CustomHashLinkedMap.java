package com.xworkz.core_java.collectionFramework.mapping.customLiknkedHashmap;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CustomHashLinkedMap {
	public static void main(String[] args) {

		Teacher dharshan =new Teacher();
		dharshan.setName("Dharshan");
		dharshan.setSection("A");
		dharshan.setCollegeName("Govt pu college Gopankoppa");
		dharshan.setSalary(35000.00);

		Teacher ramesh =new Teacher();
		ramesh.setName("Ramesh");
		ramesh.setSection("B");
		ramesh.setCollegeName("Govt pu college Gopankoppa");
		ramesh.setSalary(30000.00);

		Students manoj=new Students();
		manoj.setName("Manoj");
		manoj.setId(1);
		manoj.setCollegeName("Govt pu college Gopankoppa");
		manoj.setFess(12000.00);

		Students manju=new Students();
		manju.setName("Manju");
		manju.setId(2);
		manju.setCollegeName("Govt pu college Gopankoppa");
		manju.setFess(12000.00);

		Students kiran=new Students();
		kiran.setName("Kiran");
		kiran.setId(3);
		kiran.setCollegeName("Govt pu college Gopankoppa");
		kiran.setFess(12000.00);

		Students sanju=new Students();
		sanju.setName("Sanju");
		sanju.setId(4);
		sanju.setCollegeName("Govt pu college Gopankoppa");
		sanju.setFess(12000.00);

		Set<Students> studentSet1=new HashSet<Students>();
		studentSet1.add(manoj);
		studentSet1.add(manju);

		Set<Students> studentSet2=new HashSet<Students>();
		studentSet2.add(kiran);
		studentSet2.add(sanju);

//			Map<Teacher, Set<Students>> mapOfTeacher=new LinkedHashMap<Teacher,Set<Students>>();
//			mapOfTeacher.put(dharshan, studentSet1);
//			mapOfTeacher.put(ramesh, studentSet2);
//			System.out.println(mapOfTeacher);
			
		Map<Teacher, Set<Students>> mapOfTeacher=new TreeMap<Teacher, Set<Students>>();
		//mapOfTeacher.put(dharshan, studentSet1);
      	mapOfTeacher.put(ramesh, studentSet2);
		System.out.println(mapOfTeacher);

		for(Map.Entry<Teacher, Set<Students>> map:mapOfTeacher.entrySet()) {
			if(map.getValue().equals(kiran));
			Set<Students> students=map.getValue();
			for(Students s:students) {
				System.out.println(s);
			}

		}	

	}

}
