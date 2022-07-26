package com.xworkz.core_java.collectionFramework.sortedSet.sortedSetAssignment.assingment4;

public class Student  implements Comparable<Student> {
	private String name;
	private int id;
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	//	return this.id-student.id;
		//if(this.id<student.id) {
		//	return +1;
			
		//}
		//if(this.id>student.id) {
			//return -1;
	
	//}
	//	return 0;
	
	

}
}