package com.xworkz.core_java.collectionFramework.mapping.customLiknkedHashmap;

public class Students {
	private String name;
	private int id;
	private String collegeName;
	private double fees;
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
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public double getFees() {
		return fees;
	}
	public void setFess(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", collegeName=" + collegeName + ", fees=" + fees + "]";
	}

	
}
