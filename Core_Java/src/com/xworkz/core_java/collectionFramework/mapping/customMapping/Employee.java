package com.xworkz.core_java.collectionFramework.mapping.customMapping;

public class Employee {
	private String empId;
	private String name;
	private String companyName;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", companyName=" + companyName + "]";
	}
	

}
