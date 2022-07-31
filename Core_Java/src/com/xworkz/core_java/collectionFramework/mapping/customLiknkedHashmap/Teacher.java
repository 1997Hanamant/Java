package com.xworkz.core_java.collectionFramework.mapping.customLiknkedHashmap;

class Teacher {
	private String name;
	private String section;
	private String collegeName;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", section=" + section + ", collegeName=" + collegeName + ", salary=" + salary
				+ "]";
	}
	
	
	

}
